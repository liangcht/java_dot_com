//package chap05;

import java.util.Scanner;
import java.util.ArrayList;


public class Game {
    public static void main(String[] args)
    {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        
        //SimpleDotCom theDotCom = new SimpleDotCom();
        ImprovedDotCom theDotCom = new ImprovedDotCom();

        int randomNum = (int) (Math.random() * 5);
        
        ArrayList<String> locations = new ArrayList<String>();
        locations.add(Integer.toString(randomNum));
        locations.add(Integer.toString(randomNum+1));
        locations.add(Integer.toString(randomNum+2)); 
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true)
        {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}
