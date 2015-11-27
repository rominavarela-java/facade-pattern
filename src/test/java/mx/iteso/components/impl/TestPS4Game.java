package mx.iteso.components.impl;

import mx.iteso.components.VideoGame;

import org.junit.Before;
import org.junit.Test;

public class TestPS4Game {

	VideoGame vg;
	
	@Before
	public void setup() {
		vg= new PS4Game("test vg");
	}
	
	@Test
	public void testSetOnlineMode() {
        vg.setOnlineMode();
    }
	
	@Test
    public void testPlay() {
        vg.play();
    }
}
