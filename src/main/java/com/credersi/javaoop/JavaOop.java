package com.credersi.javaoop;

public class JavaOop {
	public static void main(String[] args) {
		PizzaDelicious pizzaDelicious = new PizzaDelicious();
		BigMamaPizza bigMama = new BigMamaPizza();
		DinosTopChippy dinos = new DinosTopChippy();
		
		
		
		// do some deliveries eg servePizza()
		pizzaDelicious.servePizza();
		bigMama.servePizza();
		dinos.serveFish();
		pizzaDelicious.serveFish();
		
		
		//give some ratings
		pizzaDelicious.giveRating(4);
		bigMama.giveRating(8);
		dinos.giveRating(7);
		
		
		// display number of deliveries
		pizzaDelicious.showDeliveries();
		bigMama.showDeliveries();
		dinos.showDeliveries();
		
		
		// display restaurant ratings
		pizzaDelicious.printRating();
		bigMama.printRating();
		dinos.printRating();
		
		
	}
}