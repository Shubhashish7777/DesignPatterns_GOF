package creationalPatterns.AbstractFactory;

import creationalPatterns.AbstractFactory.factory.MazeFactory;
import creationalPatterns.mazeNoDP.java.Maze;
import creationalPatterns.mazeNoDP.java.constants.Direction;
import creationalPatterns.mazeNoDP.java.mapsites.Door;
import creationalPatterns.mazeNoDP.java.mapsites.Room;
import creationalPatterns.mazeNoDP.java.mapsites.Wall;

public class MazeGame {

    public Maze createMaze(MazeFactory mazeFactory){
        Maze maze =mazeFactory.makeMaze();
        Room r1 = mazeFactory.makeRoom(1);
        Room r2 = mazeFactory.makeRoom(2);
        Door door1 = mazeFactory.makeDoor(r1,r2);
        maze.addRoom(r1);
        maze.addRoom(r2);
        r1.setSides(Direction.North, mazeFactory.makeWall());
        r1.setSides(Direction.East, door1);
        r1.setSides(Direction.South, mazeFactory.makeWall());
        r1.setSides(Direction.West, mazeFactory.makeWall());

        r2.setSides(Direction.North, mazeFactory.makeWall());
        r2.setSides(Direction.East, mazeFactory.makeWall());
        r2.setSides(Direction.South, mazeFactory.makeWall());
        r2.setSides(Direction.West, door1);
        return maze;
    }

}
