package com.hotelbooking.staff;

import com.hotelbooking.worker.worker;

public class Porter  extends worker {
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
        System.out.println("Helps the guest take his or her luggage to the room and makes sure the room is acceptable to the guest");
    }
}
