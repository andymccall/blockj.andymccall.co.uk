package uk.co.andymccall.blockj;

import com.google.common.hash.Hashing;
import uk.co.andymccall.blockj.model.Block;
import uk.co.andymccall.blockj.model.Transaction;
import uk.co.andymccall.blockj.model.TransactionDetails;
import uk.co.andymccall.blockj.model.TransactionType;

import java.sql.Timestamp;
import java.util.ArrayList;

import static com.google.common.base.Charsets.UTF_8;

public class Application {

    public static void main(String[] args) {

        String transactionHash = Hashing.sha256()
                .hashString("0", UTF_8)
                .toString();

        Timestamp genesisTimestamp = new Timestamp(System.currentTimeMillis());

        TransactionDetails genesisTransactionDetails = new TransactionDetails("",
                "0xFABb258FF32DE6408Eb58108D145F49A5dc53c8B",
                TransactionType.RECEIVE,
                1000000L);

        Transaction genesisTransaction = new Transaction(genesisTransactionDetails.getAmount(),
                0L,
                transactionHash,
                0L,
                "txId",
                genesisTimestamp.getTime(),
                genesisTransactionDetails);

        String genesisHash = Hashing.sha256()
                .hashString(genesisTransaction.toString(), UTF_8)
                .toString();

        Block genesisBlock = new Block(0,genesisHash,"0", genesisTimestamp.getTime(),genesisTransaction);
        genesisBlock.setVersion(1);

        System.out.print("Genesis Block: ");
        System.out.println(genesisBlock.toString());

        String address = genesisBlock.getTransaction().getTransactionDetails().getAddress();
        Long balance=0L;

        if (genesisBlock.getTransaction().getTransactionDetails().getTransactionType() == TransactionType.RECEIVE) {
            balance = balance + genesisBlock.getTransaction().getTransactionDetails().getAmount();
        } else if (genesisBlock.getTransaction().getTransactionDetails().getTransactionType() == TransactionType.SEND) {
            balance = balance - genesisBlock.getTransaction().getTransactionDetails().getAmount();
        }

        System.out.println("Address: " + address);
        System.out.print("Balance: " + balance + " J ");
        System.out.println("(" + genesisBlock.getTransaction().getComfirmations() + " confirmations)");

    }

}
