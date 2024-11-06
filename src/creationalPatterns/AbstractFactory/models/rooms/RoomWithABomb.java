package creationalPatterns.AbstractFactory.models.rooms;

import creationalPatterns.mazeNoDP.java.mapsites.Room;

public class RoomWithABomb extends Room {

    private boolean bombExploded;
    private int countBomb;
    public RoomWithABomb(int roomNumber) {
        super(roomNumber);
        this.bombExploded = false;
        this.countBomb= 1;
    }
}
