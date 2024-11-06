package creationalPatterns.AbstractFactory.factory;

import creationalPatterns.mazeNoDP.java.Maze;
import creationalPatterns.mazeNoDP.java.mapsites.Door;
import creationalPatterns.mazeNoDP.java.mapsites.Room;
import creationalPatterns.mazeNoDP.java.mapsites.Wall;

public class MazeFactory {

    public  MazeFactory(){

    }

    public Maze makeMaze(){
        return new Maze();
    }
    public Wall makeWall( ){
        return  new Wall();
    }
    public Room makeRoom(int roomNo ){
        return new Room(roomNo);
    }
    public Door makeDoor(Room room1, Room room2){
        return new Door(room1, room2);
    }
}
