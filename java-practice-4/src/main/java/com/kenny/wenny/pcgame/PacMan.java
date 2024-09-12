package com.kenny.wenny.pcgame;

public class PacMan extends PcGameImpl {
    @Override
    public String getGameName() {
        return "PAC MAN, yay";
    }

    @Override
    public void runGame() {
        System.out.println("PacMan running...");
    }
}
