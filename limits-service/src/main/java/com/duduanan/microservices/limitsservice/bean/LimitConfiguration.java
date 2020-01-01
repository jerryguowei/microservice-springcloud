package com.duduanan.microservices.limitsservice.bean;

public class LimitConfiguration {
	private int maximum;
	private int minimum;
	public int getMaximum() {
		return maximum;
	}
	
	public LimitConfiguration() {
		
	}
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	
	
}
