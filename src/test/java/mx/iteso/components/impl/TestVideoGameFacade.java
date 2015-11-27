package mx.iteso.components.impl;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import mx.iteso.components.GameConsole;
import mx.iteso.components.GameController;
import mx.iteso.components.Lights;
import mx.iteso.components.Router;
import mx.iteso.components.SoundSystem;
import mx.iteso.components.TV;
import mx.iteso.components.VideoGame;
import mx.iteso.facade.VideoGameFacade;

public class TestVideoGameFacade {

	TV tv;
    GameConsole console;
    GameController controller;
    SoundSystem soundSystem;
    Router router;
    Lights lights;
    VideoGame game;
    
    VideoGameFacade facade;
    
    @Before
    public void setup() {
    	tv= Mockito.mock(TV.class);
    	console= Mockito.mock(GameConsole.class);
    	controller= Mockito.mock(GameController.class);
    	soundSystem= Mockito.mock(SoundSystem.class);
    	router= Mockito.mock(Router.class);
    	lights= Mockito.mock(Lights.class);
    	game= Mockito.mock(VideoGame.class);
    	
    	facade= new VideoGameFacade(tv, console, controller, soundSystem, router, lights);
    }
    
    @Test
    public void testPlayOnlineGame(String gameName){
        facade.playOnlineGame("test game name");
    }

    @Test
    public void testStopPlayingGame(){
        facade.stopPlayingGame();
    }
}
