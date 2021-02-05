package com.hotelbooking.room;

public abstract class room {

   private String room;
    public void setNumberOfRooms(String room) {
        this.room = room;
        System.out.println("This number has " + room);
    }
    public abstract void clientsCheckedIn();

}
