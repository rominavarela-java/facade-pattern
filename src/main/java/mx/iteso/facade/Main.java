package mx.iteso.facade;

import mx.iteso.components.GameConsole;
import mx.iteso.components.GameController;
import mx.iteso.components.Lights;
import mx.iteso.components.Router;
import mx.iteso.components.SoundSystem;
import mx.iteso.components.TV;
import mx.iteso.components.impl.Bose;
import mx.iteso.components.impl.DualShock;
import mx.iteso.components.impl.EcoLights;
import mx.iteso.components.impl.Linksys;
import mx.iteso.components.impl.PS4;
import mx.iteso.components.impl.SonyBravia;
import mx.iteso.components.impl.XBOX;

public class Main {
    public static void main (String[] args){
        GameConsole ps4 = new PS4();
        GameConsole xbox = new XBOX();
        GameController dualShock = new DualShock();
        Lights lights = new EcoLights();
        Router linksys = new Linksys();
        SoundSystem bose = new Bose();
        TV tv = new SonyBravia();

        VideoGameFacade videoGameFacade = new VideoGameFacade(tv,ps4,dualShock,bose,linksys,lights);

        videoGameFacade.playOnlineGame("Fifa 16");

        videoGameFacade.stopPlayingGame();

        videoGameFacade = new VideoGameFacade(tv,xbox,dualShock,bose,linksys,lights);

        videoGameFacade.playOnlineGame("Halo 5");
    }
}
