package com.kenny.wenny.pcgame;

public abstract class PcGameImpl implements PcGame {
    private final String endCredits = "These are the end credits";

    public String getEndCredits() {
        return endCredits;
    }

    public abstract String getGameName();

    public void rollEndCredits() {
        System.out.println(endCredits);
    }

    public abstract void runGame();
    /*
    Follow along with your instructor to make an abstract class - ‘PcGame’
We will have different PcGames, but all will have the following as
standard:
*  Attributes
*  String endCredits
*  Same for all subclasses
*  String gameName
*  Varies per subclass
*  Methods
*  rollEndCredits()
*  This is the same for all, and prints out endCredits
*  runGame()
*  Varies between the games
     */
}
