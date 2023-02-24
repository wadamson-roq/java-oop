package com.credersi.javaoop;

import static org.junit.Assert.assertTrue;
// import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JavaOopTest {
	@Test
	public void testsToBeDefined() {
		assertTrue(true);
	}

	@Test
	public void testPizza() {
		BigMamaPizza mamapizza = new BigMamaPizza();
		PizzaDelicious pizzad = new PizzaDelicious();
		assertEquals(mamapizza.servePizza(), "Pizza delivered");
		assertEquals(pizzad.servePizza(), "Pizza delivered");
	}

	@Test
	public void testFish() {
		DinosTopChippy topchippy = new DinosTopChippy();
		PizzaDelicious pizzad = new PizzaDelicious();
		assertEquals(topchippy.serveFish(), "Fish delivered");
		assertEquals(pizzad.serveFish(), "Fish delivered");
	}

	@Test
	public void testPDBoth() {
		PizzaDelicious pizzad = new PizzaDelicious();
		assertEquals(pizzad.servePizza(), "Pizza delivered");
		assertEquals(pizzad.serveFish(), "Fish delivered");
	}

	@Test
	public void testAllOpen() {
		BigMamaPizza mamapizza = new BigMamaPizza();
		PizzaDelicious pizzad = new PizzaDelicious();
		DinosTopChippy topchippy = new DinosTopChippy();
		assertTrue(mamapizza.open);
		assertTrue(pizzad.open);
		assertTrue(topchippy.open);
	}

	@Test
	public void testRatings() {
		BigMamaPizza mamapizza = new BigMamaPizza();
		PizzaDelicious pizzad = new PizzaDelicious();
		DinosTopChippy topchippy = new DinosTopChippy();
		assertEquals(mamapizza.rating, 7);
		assertEquals(pizzad.rating, 3);
		assertEquals(topchippy.rating, 9);
	}

	@Test
	public void testDeliverCount() {
		BigMamaPizza mamapizza = new BigMamaPizza();
		PizzaDelicious pizzad = new PizzaDelicious();
		DinosTopChippy topchippy = new DinosTopChippy();
		for (int i = 0; i < 3; i++) {
			mamapizza.servePizza();
			pizzad.servePizza();
			pizzad.serveFish();
			topchippy.serveFish();
		}
		assertEquals(mamapizza.showDeliveries(), "Has delivered 3");
		assertEquals(pizzad.showDeliveries(), "Has delivered 6");
		assertEquals(topchippy.showDeliveries(), "Has delivered 3");
	}
}