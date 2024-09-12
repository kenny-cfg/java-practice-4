package com.kenny.wenny;

import com.kenny.wenny.pcgame.PacMan;
import com.kenny.wenny.pcgame.PcGame;

public class Main {
    public static void main(String[] args) {
        PcGame game = new PacMan();
        System.out.println(game.getGameName());
        System.out.println(game.getEndCredits());
        game.runGame();
        game.rollEndCredits();
    }
}

/*
Create a class CalculatorUtil with a static method as follows, &
implement the missing logic
public static boolean equalsSum(int sum, int num1, int num2){
// logic here
// if num1 + num2 = sum, return true, otherwise false
}
●
Use this static method in a main method in another class (e.g. a class
called Main)
 */