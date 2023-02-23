package com.credersi.javaoop;

public class Takeaway {
	protected boolean open;
	protected int numberOfDeliveries;
	protected int rating;
	
	public Takeaway() {
		this.numberOfDeliveries = 0;
	}
	
	public void deliver() {
		this.numberOfDeliveries++;
	}
	
	public void printRating() {
		String rating = "";
		for (int i = 0; i < this.rating; i++) {
			rating += "*";
		}
		System.out.println(rating);
	}
	
	public String giveRating(int foodRating) {
		if (foodRating < 7) {
			return("Don't bother coming again");
		} else {
			return("Please come again");
		}
	}
	
	public String showDeliveries() {
		return "Has delivered " + this.numberOfDeliveries; 
	}
}
