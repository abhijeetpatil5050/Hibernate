package com.hibernateinheritancejoined;

import javax.persistence.Entity;

@Entity
public class Swift extends Car {

	public int milage;
	public int weight;

	public Swift(int carid, String carname, int milage, int weight) {
		super(carid, carname);
		this.milage = milage;
		this.weight = weight;
	}

}
