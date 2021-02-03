package com.hotelbooking.numbers;

import com.hotelbooking.room.room;

public class FiveStar extends com.hotelbooking.room.room {

    private String room;

    @Override
    public void clientsCheckedIn() {

    }
    public void setNumberOfRooms(String room) {
        this.room = room;
        System.out.println("This number has " + room);
    }

}
