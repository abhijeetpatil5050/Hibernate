package com.hibernateinheritancejoined;

import javax.persistence.Entity;

@Entity
public class I20 extends Car {

	public int milege;
	public int weight;
	
	public I20(int carid, String carname, int milege, int weight) {
		super(carid, carname);
		this.milege = milege;
		this.weight = weight;
	}
	
	
}
