package creationalPatterns.mazeNoDP.java.mapsites;

import java.text.MessageFormat;

public class Door implements  MapSite{

    private Room roomLeft;
    private Room roomRight;
    private boolean isOpen;

    public Door(Room roomLeft, Room roomRight){
        this.roomLeft = roomLeft;
        this.roomRight = roomRight;
    }

    @Override
    public void Enter() {
        System.out.println(MessageFormat.format("Going through Door between Room {0} and {1}",roomLeft,roomRight));

    }

    public Room otherSideFrom( Room roomLeft){
        return  roomLeft==this.roomLeft? roomRight: roomLeft;
    }
}
