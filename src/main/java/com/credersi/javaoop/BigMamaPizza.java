package com.credersi.javaoop;

public class BigMamaPizza extends Takeaway implements Pizza {
	public BigMamaPizza() {
		this.open = true;
		this.rating = 7;
	}
	
	public String servePizza() {
		this.deliver();
		return "Pizza delivered";
	}
}
