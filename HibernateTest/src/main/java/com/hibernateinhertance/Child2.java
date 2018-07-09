package com.hibernateinhertance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PARENT_DETAILS")
@DiscriminatorValue("CHILD2VAL")
public class Child2 extends Parent {
	
	@Column(name = "CHILD2_NAME")
	private String c2Name;

	
	/*@Column(name = "CHILD2_ID")
	private int c2ID;*/
	
	public Child2() {}
	
	
	public Child2(String pName, int pID, String c2Name) {
		super(pName, pID);
		this.c2Name = c2Name;
		
	}
	
	
	
	

}
