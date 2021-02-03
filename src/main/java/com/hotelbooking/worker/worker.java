package com.hotelbooking.worker;

public abstract class worker {
    private int payment;
    private String job;
    public void setSelery(int payment) {
        this.payment = payment;
        System.out.println("This worker selery is " + payment);
    }

    public void setJob(String job) {
        this.job = job;
        System.out.println("His work is " + job);
    }
    public abstract void doJob();
}
