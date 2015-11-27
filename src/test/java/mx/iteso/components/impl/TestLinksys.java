package mx.iteso.components.impl;

import mx.iteso.components.Router;

import org.junit.Before;
import org.junit.Test;

public class TestLinksys {

	Router ctrl;
	
	@Before
	public void setup() {
		ctrl= new Linksys();
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
	public void testCheckInternet() {
		ctrl.checkInternet();
	}
	
	@Test
	public void redundancyTest() {
		ctrl.off();
		ctrl.off();
		
		ctrl.on();
		ctrl.on();
	}
}
