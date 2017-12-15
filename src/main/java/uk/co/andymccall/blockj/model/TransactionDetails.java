package uk.co.andymccall.blockj.model;

public class TransactionDetails {

    private String account;
    private String address;
    private TransactionType transactionType;
    private Long amount;

    public TransactionDetails() {
    }

    public TransactionDetails(String account, String address, TransactionType transactionType, Long amount) {
        this.account = account;
        this.address = address;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "TransactionDetails{" +
                "account='" + account + '\'' +
                ", address='" + address + '\'' +
                ", transactionType=" + transactionType +
                ", amount=" + amount +
                '}';
    }
}
