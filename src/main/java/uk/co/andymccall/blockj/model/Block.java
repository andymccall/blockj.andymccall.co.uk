package uk.co.andymccall.blockj.model;

public class Block {

    private int index;
    private String hash;
    private String previousHash;
    private Long timestamp;
    private String payload;

    public Block(int index, String hash, String previousHash, Long timestamp, String payload) {
        this.index = index;
        this.hash = hash;
        this.previousHash = previousHash;
        this.timestamp = timestamp;
        this.payload = payload;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
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

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Block{" +
                "index=" + index +
                ", hash='" + hash + '\'' +
                ", previousHash='" + previousHash + '\'' +
                ", timestamp=" + timestamp +
                ", payload='" + payload + '\'' +
                '}';
    }
}
