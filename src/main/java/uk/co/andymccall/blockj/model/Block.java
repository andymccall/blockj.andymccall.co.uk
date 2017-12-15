package uk.co.andymccall.blockj.model;

public class Block {

    private int version;
    private int height;
    private String hash;
    private String previousHash;
    private Long timestamp;
    private Transaction transaction;

    public Block() {

    }

    public Block(int height, String hash, String previousHash, Long timestamp, Transaction transaction) {
        this.height = height;
        this.hash = hash;
        this.previousHash = previousHash;
        this.timestamp = timestamp;
        this.transaction = transaction;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Block{" +
                "version=" + version +
                ", height=" + height +
                ", hash='" + hash + '\'' +
                ", previousHash='" + previousHash + '\'' +
                ", timestamp=" + timestamp +
                ", transaction='" + transaction + '\'' +
                '}';
    }
}
