package creationalPatterns.mazeNoDP.java.mapsites;

import java.text.MessageFormat;

public class Wall implements  MapSite{


    public Wall() {

    }

    @Override
    public void Enter() {
        System.out.println("Faced an Wall");

    }

}
