package creationalPatterns.mazeNoDP.java;

import creationalPatterns.mazeNoDP.java.mapsites.Room;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Maze {

    private HashMap<Integer, Room> roomHashMap;
    private AtomicInteger counter;

    Maze() {
        this.roomHashMap = new HashMap<>();
        this.counter = new AtomicInteger(0);
    }
    void addRoom(Room room) {
         this.roomHashMap.put(counter.getAndIncrement(), room);
    }
    Room getRoom(int roomNumber){
        return roomHashMap.get(roomNumber);
    }


}
