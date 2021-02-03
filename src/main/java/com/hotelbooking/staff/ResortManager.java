package com.hotelbooking.staff;

import com.hotelbooking.worker.worker;

public class ResortManager extends worker {
    @Override
    public void setSelery(int payment) {
        super.setSelery(payment);
    }

    @Override
    public void setJob(String job) {
        super.setJob(job);
    }

    public  void doJob(){
        System.out.println("Responsible for providing a pleasant experience for resort guests, marketing, hiring contractors for service work orders, managing inventory, and performing various administrative duties");
    }
}
