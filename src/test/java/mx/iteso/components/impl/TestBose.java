package mx.iteso.components.impl;

import mx.iteso.components.SoundSystem;

import org.junit.Before;
import org.junit.Test;

public class TestBose {
	
	SoundSystem sound;
	
	@Before
	public void setup() {
		sound= new Bose();
	}
	
	@Test
	public void testOn() {
		sound.on();
	}
	
	@Test
	public void testOff() {
		sound.off();
	}
	
	@Test
	public void testToOpticalEntry() {
		sound.toOpticalEntry();
	}
	
	@Test
	public void redundancyTest() {
		sound.off();
		sound.off();
		
		sound.on();
		sound.on();
	}
}
