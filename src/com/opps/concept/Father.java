package com.opps.concept;

public class Father extends GrandFather {

	public String businessName;
	
	@Override
	public String toString() {
		return surname+" "+name;
	}
}