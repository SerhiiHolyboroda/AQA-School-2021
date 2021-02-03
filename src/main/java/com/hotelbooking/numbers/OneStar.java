package com.hotelbooking.numbers;

public class OneStar extends com.hotelbooking.room.room {

    private String room;

    @Override
    public void clientsCheckedIn() {

    }
    public void setNumberOfRooms(String room) {
        this.room = room;
        System.out.println("This number has " + room);
    }

}
