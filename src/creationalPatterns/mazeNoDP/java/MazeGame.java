package creationalPatterns.mazeNoDP.java;

import creationalPatterns.mazeNoDP.java.constants.Direction;
import creationalPatterns.mazeNoDP.java.mapsites.Door;
import creationalPatterns.mazeNoDP.java.mapsites.Room;
import creationalPatterns.mazeNoDP.java.mapsites.Wall;

public class MazeGame {

    public Maze createMaze( ){
        Maze maze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Door door1 = new Door(r1, r2);
        maze.addRoom(r1);
        maze.addRoom(r2);
        r1.setSides(Direction.North, new Wall());
        r1.setSides(Direction.East, door1);
        r1.setSides(Direction.South, new Wall());
        r1.setSides(Direction.West, new Wall());

        r2.setSides(Direction.North, new Wall());
        r2.setSides(Direction.East, new Wall());
        r2.setSides(Direction.South, new Wall());
        r2.setSides(Direction.West, door1);
        return maze;
    }
}
