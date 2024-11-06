package creationalPatterns.mazeNoDP.java.mapsites;

import creationalPatterns.mazeNoDP.java.constants.Direction;

import java.text.MessageFormat;
import java.util.List;

public class Room implements  MapSite{

    private  MapSite[] sides = new MapSite[4];
    private  int roomNumber;

    public Room(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public MapSite getSide(Direction direction){
        return this.sides[direction.ordinal()];
    }

    public  void  setSides(Direction direction, MapSite side){
        this.sides[direction.ordinal()]= side;
    }

    @Override
    public void Enter() {
        System.out.println(MessageFormat.format("Entered Room Number {0}", roomNumber));
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                '}';
    }
}
