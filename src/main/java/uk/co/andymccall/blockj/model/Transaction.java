package uk.co.andymccall.blockj.model;

public class Transaction {

    private Long amount;
    private Long comfirmations;
    private String blockHash;
    private Long blockIndex;
    private String txId;
    private Long timestamp;
    private TransactionDetails transactionDetails;

    public Transaction() {
    }

    public Transaction(Long amount, Long comfirmations, String blockHash, Long blockIndex, String txId, Long timestamp, TransactionDetails transactionDetails) {
        this.amount = amount;
        this.comfirmations = comfirmations;
        this.blockHash = blockHash;
        this.blockIndex = blockIndex;
        this.txId = txId;
        this.timestamp = timestamp;
        this.transactionDetails = transactionDetails;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Long getComfirmations() {
        return comfirmations;
    }

    public void setComfirmations(Long comfirmations) {
        this.comfirmations = comfirmations;
    }

    public String getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(String blockHash) {
        this.blockHash = blockHash;
    }

    public Long getBlockIndex() {
        return blockIndex;
    }

    public void setBlockIndex(Long blockIndex) {
        this.blockIndex = blockIndex;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public TransactionDetails getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(TransactionDetails transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", comfirmations=" + comfirmations +
                ", blockHash='" + blockHash + '\'' +
                ", blockIndex=" + blockIndex +
                ", txId='" + txId + '\'' +
                ", timestamp=" + timestamp +
                ", transactionDetails=" + transactionDetails +
                '}';
    }
}
