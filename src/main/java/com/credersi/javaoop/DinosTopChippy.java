package com.credersi.javaoop;

public class DinosTopChippy extends Takeaway implements FishAndChips {
	public DinosTopChippy() {
		this.open = true;
		this.rating = 9;
	}
	
	public String serveFish() {
		this.deliver();
		return "Fish delivered";
	}
}
