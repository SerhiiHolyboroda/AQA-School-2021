package com.hotelbooking.staff;

import com.hotelbooking.worker.worker;

public class ResortManager extends worker {
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

    public  void doJob(){
        System.out.println("Responsible for providing a pleasant experience for resort guests, marketing, hiring contractors for service work orders, managing inventory, and performing various administrative duties");
    }
}
