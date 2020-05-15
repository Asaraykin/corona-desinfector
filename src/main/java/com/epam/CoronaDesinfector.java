package com.epam;

public class CoronaDesinfector {
    private Announcer announcer = new ConsoleAnnouncer();
    private Policeman policeman = new PolicemanImpl();

    public void start(Room room){
        announcer.announce("desinfection begins");
        policeman.makePeopleLeaveRoom();
        desinfect();
        announcer.announce("enter room at your risk");
    }

    private void desinfect(){
        System.out.println("corona go out");
    }
}


