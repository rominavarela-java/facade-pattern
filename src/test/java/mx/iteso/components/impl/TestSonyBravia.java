package mx.iteso.components.impl;

import mx.iteso.components.TV;

import org.junit.Before;
import org.junit.Test;

public class TestSonyBravia {

	TV tv;
	
	@Before
	public void setup() {
		tv= new SonyBravia();
	}
	
	@Test
	public void testOn() {
		tv.on();
	}
	
	@Test
	public void testOff() {
		tv.off();
	}
	

	@Test
	public void testToHDMI() {
		tv.toHDMI();
	}
	
	@Test
	public void redundancyTest() {
		tv.off();
		tv.off();
		
		tv.on();
		tv.on();
	}
}
