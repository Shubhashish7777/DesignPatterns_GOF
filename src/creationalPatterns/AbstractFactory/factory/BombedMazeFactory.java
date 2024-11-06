package creationalPatterns.AbstractFactory.factory;

import creationalPatterns.AbstractFactory.models.rooms.EnchantedRoom;
import creationalPatterns.AbstractFactory.models.rooms.RoomWithABomb;
import creationalPatterns.AbstractFactory.models.walls.BombedWall;
import creationalPatterns.mazeNoDP.java.mapsites.Room;
import creationalPatterns.mazeNoDP.java.mapsites.Wall;

public class BombedMazeFactory extends MazeFactory{

    public BombedMazeFactory(){

    }

    @Override
    public  Wall makeWall(){
        return new BombedWall();
    }

    public Room makeRoom(int roomNumber){
        return new RoomWithABomb(roomNumber);
    }
}

