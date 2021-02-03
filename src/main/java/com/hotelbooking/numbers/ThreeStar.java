package com.hotelbooking.numbers;

public class ThreeStar extends com.hotelbooking.room.room {

    @Override
    public void clientsCheckedIn() {

    }
    private String room;


    public void setNumberOfRooms(String room) {
        this.room = room;
        System.out.println("This number has " + room);
    }

}
