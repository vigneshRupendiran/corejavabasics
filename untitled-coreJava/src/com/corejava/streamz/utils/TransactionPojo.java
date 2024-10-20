package com.corejava.streamz.utils;

public class TransactionPojo {
    private String id;
    private double indianRupee;

    public TransactionPojo(String id, double indianRupee) {
        this.id = id;
        this.indianRupee = indianRupee;
    }

    @Override
    public String toString() {
        return "TransactionPojo{" +
                "id='" + id + '\'' +
                ", indianRupee=" + indianRupee +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getIndianRupee() {
        return indianRupee;
    }

    public void setIndianRupee(double indianRupee) {
        this.indianRupee = indianRupee;
    }
}
