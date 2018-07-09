package com.hibernateinhertance;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "PARENT_DETAILS")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="WHO",
    discriminatorType=DiscriminatorType.STRING
)
@DiscriminatorValue(value="PARENTVAL")
public class Parent {

	@Column(name = "PARENT_NAME")
	private String pName;
	
	@Id
/*	@GeneratedValue*/
	@Column(name = "PARENT_ID")
	private int pID;
	
	
	
	
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parent(String pName, int pID) {
		super();
		this.pName = pName;
		this.pID = pID;
	}
	
	
	

	
}
