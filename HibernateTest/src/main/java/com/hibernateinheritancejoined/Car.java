package com.hibernateinheritancejoined;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Car {
	@Id
	public int carid;
	public String carname;
	
	public Car(int carid, String carname) {
		super();
		this.carid = carid;
		this.carname = carname;
	}

	
	
}
