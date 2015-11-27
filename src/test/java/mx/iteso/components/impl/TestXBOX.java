package mx.iteso.components.impl;

import mx.iteso.components.GameConsole;
import mx.iteso.components.VideoGame;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestXBOX {
	
	GameConsole ctrl;
	VideoGame vg;
	
	@Before
	public void setup() {
		ctrl= new XBOX();
		vg= Mockito.mock(VideoGame.class);
	}
	
	@Test
	public void testOn() {
		ctrl.on();
	}
	
	@Test
	public void testOff() {
		ctrl.off();
	}
	

	@Test
	public void testInsertVideoGame() {
		ctrl.insertGame(vg);
	}
	
	@Test
	public void redundancyTest() {
		ctrl.off();
		ctrl.off();
		
		ctrl.on();
		ctrl.on();
	}
}
