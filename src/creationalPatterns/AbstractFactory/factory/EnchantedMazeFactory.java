package creationalPatterns.AbstractFactory.factory;

import creationalPatterns.AbstractFactory.models.doors.DoorNeedingSpell;
import creationalPatterns.AbstractFactory.models.rooms.EnchantedRoom;
import creationalPatterns.mazeNoDP.java.mapsites.Door;
import creationalPatterns.mazeNoDP.java.mapsites.Room;

public class EnchantedMazeFactory extends  MazeFactory{
    
    public EnchantedMazeFactory(){
        
    }
    
    @Override
    public Room makeRoom( int roomNumber){
        return new EnchantedRoom(roomNumber, castSpell(roomNumber));
    }

    public Door makeDoor(Room r1, Room r2){
        return new DoorNeedingSpell(r1,r2);
    }

    private boolean castSpell(int roomNumber) {
        System.out.println(  """
                
                Oh, mystical forces, awaken from slumber,
                Weave the magic of knowledge and thunder to make the room Number: 
                """+roomNumber);

        return true;
    }
}
