package com.mant.pojo;

public class Localization {
	private String direction;
	private String country;
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Localization [direction=" + direction + ", country=" + country + "]";
	}
	
	
}
