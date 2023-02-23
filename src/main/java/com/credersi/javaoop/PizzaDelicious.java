package com.credersi.javaoop;

public class PizzaDelicious extends Takeaway implements Pizza, FishAndChips {
	public PizzaDelicious() {
		this.open = true;
		this.rating = 3;
	}
	
	public String servePizza() {
		this.deliver();
		return "Pizza delivered";
	}
	
	public String serveFish() {
		this.deliver();
		return "Fish delivered";
	}

}
