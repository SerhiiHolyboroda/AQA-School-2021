package com.hotelbooking.staff;

import com.hotelbooking.worker.worker;

public class Concierge extends worker {

    private int hours;

    @Override
    public void setSelery(int payment) {
        super.setSelery(payment);
    }

    @Override
    public void setWorkingHours(int hours) {
        this.hours = hours;
        System.out.println("He works for " + hours + "hours");
    }
    @Override
    public void doJob() {
        System.out.println("Welcome several guests as they enter the building, confirm their reservations, answer and transfer phone calls, and provide general knowledge regarding hotel details and policies");
    }
}
