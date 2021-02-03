package com.hotelbooking.staff;

import com.hotelbooking.worker.worker;

public class Concierge extends worker {

    @Override
    public void setSelery(int payment) {
        super.setSelery(payment);
    }

    @Override
    public void setJob(String job) {
        super.setJob(job);
    }
    @Override
    public void doJob() {
        System.out.println("Welcome several guests as they enter the building, confirm their reservations, answer and transfer phone calls, and provide general knowledge regarding hotel details and policies");
    }
}
