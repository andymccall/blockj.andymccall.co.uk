package uk.co.andymccall.blockj;

import com.google.common.hash.Hashing;
import uk.co.andymccall.blockj.model.Block;

import java.sql.Timestamp;
import java.util.ArrayList;

import static com.google.common.base.Charsets.UTF_8;

public class Application {

    public static void main(String[] args) {

        int chainLength = 5;

        String genesisHash = Hashing.sha256()
                .hashString("0", UTF_8)
                .toString();

        Timestamp genesisTimestamp = new Timestamp(System.currentTimeMillis());

        Block genesisBlock = new Block(0,genesisHash,"0", genesisTimestamp.getTime(),"Genesis Payload");

        System.out.print("Genesis Block: ");
        System.out.println(genesisBlock.toString());

        ArrayList<Block> chain = new ArrayList<Block>();

        chain.add(genesisBlock);

        for (int i = genesisBlock.getIndex(); i < chainLength; i++) {

            String newHash = Hashing.sha256()
                    .hashString(chain.get(i).getHash().concat(chain.get(i).getPayload()), UTF_8)
                    .toString();

            Timestamp newTimestamp = new Timestamp(System.currentTimeMillis());

            String newPayload = "Payload " + i;

            Block newBlock = new Block(chain.get(i).getIndex()+1,
                    newHash,
                    chain.get(i).getHash(),
                    newTimestamp.getTime(),
                    newPayload);

            chain.add(newBlock);

            System.out.println(newBlock.toString());

        }



    }

}
