package com.hotelbooking.staff;

import com.hotelbooking.worker.worker;

public class Concierge extends worker {

<<<<<<< HEAD
    private int hours;
=======
    private String hours;
>>>>>>> main

    @Override
    public void setSelery(int payment) {
        super.setSelery(payment);
    }

    @Override
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
    @Override
    public void doJob() {
        System.out.println("Welcome several guests as they enter the building, confirm their reservations, answer and transfer phone calls, and provide general knowledge regarding hotel details and policies");
    }
}
