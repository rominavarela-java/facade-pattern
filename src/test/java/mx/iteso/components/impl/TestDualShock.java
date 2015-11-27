package mx.iteso.components.impl;

import mx.iteso.components.GameController;

import org.junit.Before;
import org.junit.Test;

public class TestDualShock {

	GameController ctrl;
	
	@Before
	public void setup() {
		ctrl= new DualShock();
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
