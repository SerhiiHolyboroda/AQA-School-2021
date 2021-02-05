package com.hotelbooking.worker;

public abstract class worker {
    private int payment;
    private int hours;
    public void setSelery(int payment) {
        this.payment = payment;
        System.out.println("This worker selery is " + payment);
    }

    public void setWorkingHours(int hours) {
        this.hours = hours;
        System.out.println("He works for " + hours + "hours");
    }
    public abstract void doJob();
}
