package com.hotelbooking.numbers;

public class FourStar extends com.hotelbooking.room.room {

    private String room;

    @Override
    public void clientsCheckedIn() {

    }
    public void getNumberOfRooms(String room) {
        this.room = room;
        System.out.println("This number has " + room);
    }

}
