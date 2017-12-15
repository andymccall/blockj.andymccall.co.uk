package uk.co.andymccall.blockj.model;

public enum TransactionType {
    SEND("send"),
    RECEIVE("receive");

    private final String displayName;

    TransactionType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

}