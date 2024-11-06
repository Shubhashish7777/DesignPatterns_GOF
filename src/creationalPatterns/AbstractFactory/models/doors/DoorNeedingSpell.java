package creationalPatterns.AbstractFactory.models.doors;

import creationalPatterns.mazeNoDP.java.mapsites.Door;
import creationalPatterns.mazeNoDP.java.mapsites.Room;

public class DoorNeedingSpell extends Door {
    public DoorNeedingSpell(Room roomLeft, Room roomRight) {
        super(roomLeft, roomRight);
    }
}
