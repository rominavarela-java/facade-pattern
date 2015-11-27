package mx.iteso.components.impl;

import mx.iteso.components.GameConsole;
import mx.iteso.components.VideoGame;

public class XBOX implements GameConsole {
    public void on() {
        System.out.println("XBOX One is ON");
    }

    public void off() {
        System.out.println("XBOX One is OFF");
    }

    public void insertGame(VideoGame videoGame) {
        System.out.println(videoGame.getName() + " has been inserted into XBOX One");
    }
}
