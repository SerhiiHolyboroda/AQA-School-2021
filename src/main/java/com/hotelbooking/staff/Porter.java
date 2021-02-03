package com.hotelbooking.staff;

import com.hotelbooking.worker.worker;

public class Porter  extends worker {

    @Override
    public void setSelery(int payment) {
        super.setSelery(payment);
    }

    @Override
    public void setJob(String job) {
        super.setJob(job);
    }

    public  void doJob(){
        System.out.println("Helps the guest take his or her luggage to the room and makes sure the room is acceptable to the guest");
    }
}
