package mx.iteso.components.impl;

import mx.iteso.components.Lights;

import org.junit.Before;
import org.junit.Test;

public class TestEcoLights {

	Lights ctrl;
	
	@Before
	public void setup() {
		ctrl= new EcoLights();
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
	public void redundancyTest() {
		ctrl.off();
		ctrl.off();
		
		ctrl.on();
		ctrl.on();
	}
}
