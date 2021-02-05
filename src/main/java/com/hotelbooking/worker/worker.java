package com.hotelbooking.worker;

public abstract class worker {
    private int payment;
<<<<<<< HEAD
    private int hours;
=======
    private String hours;
>>>>>>> main
    public void setSelery(int payment) {
        this.payment = payment;
        System.out.println("This worker selery is " + payment);
    }

<<<<<<< HEAD
    public void setWorkingHours(int hours) {
        this.hours = hours;
        System.out.println("He works for " + hours + "hours");
=======
    public void setWorkingHours(String hours) {
        this.hours = hours;
        System.out.println("Hi for work " + hours + "hours");
>>>>>>> main
    }
    public abstract void doJob();
}
