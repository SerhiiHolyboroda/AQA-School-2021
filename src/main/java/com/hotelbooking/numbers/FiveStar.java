package com.hotelbooking.numbers;

import com.hotelbooking.room.room;

public class FiveStar extends com.hotelbooking.room.room {

    private String room;

    @Override
<<<<<<< HEAD
    public void clientsCheckedIn() {
=======
    public void clientsCheckIn() {
>>>>>>> main

    }
    public void setNumberOfRooms(String room) {
        this.room = room;
        System.out.println("This number has " + room);
    }

}
