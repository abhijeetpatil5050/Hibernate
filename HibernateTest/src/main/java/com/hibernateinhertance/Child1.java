package com.hibernateinhertance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PARENT_DETAILS")
@DiscriminatorValue("CHILD1VAL")
public class Child1 extends Parent {
	
	@Column(name = "CHILD1_NAME")
	private String c1Name;
	
	
	/*@Column(name = "CHILD1_ID")
	private int c1ID;*/
	
	
	
	public Child1() {}

	public Child1(String pName, int pID, String c1Name) {
		super(pName, pID);
		this.c1Name = c1Name;
		
	}

	

}
