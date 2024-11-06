package creationalPatterns.AbstractFactory;

import creationalPatterns.AbstractFactory.factory.EnchantedMazeFactory;

public class client {
    public static void main(String [] args){

        MazeGame mazeGame = new MazeGame();
        mazeGame.createMaze(new EnchantedMazeFactory());
    }
}
