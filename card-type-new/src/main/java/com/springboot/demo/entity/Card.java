package com.springboot.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

//@Data                             // Lambok to avoid boiler plates or instead of getter and setter we can use this annotation
@Entity                            //@Entity converts class to the entity class. To make our class jpa(Java Persistence API) entity :to secure our data and to reduce leakage of the data. Anywhere we can write 
                                   //-the attributes and when we put the @Entity then it will become the entity class or java bean class or we can make the attributes as the private and only visible to the 
@Table(name="card")                //@Table specifies the table in the database with which this entity is mapped
public class Card  {

	@Id                            //@Id is primary key of the entity,by putting the @Id we can specify the this attribute or field is a primary key of the class
	@GeneratedValue(strategy = GenerationType.IDENTITY)    //Primary key generation strategy and by using this we can make this field as a auto generation 
	private int id;

	@Column(name="name",nullable=false)                   //@Column is to make this attribute or field as the table's column name and if we dont give @Column and then also autiomatically it will make attributes of the entity class as the column name  
														  //variable name should be always in the lower case-RULE
													      //name="name"-1st name is the attribute we can give anything. nullable false means we cannot leave this as a blank
	@Size(min = 3,message = "atleast type minimum 3 characters")  //Size tells us it should be in the specified
	@NotEmpty
	private String name;

	@Column(name="date")
	private String date;

	@Column(name="cardno")
	private String cardno;

	@Column(name="cardtype")
	private String cardtype;

	public Card() {									    						//default constructor

	}

	public Card(String name, String date, String cardno, String cardtype) {       //parameterized constructor
		super();																//we will not use the id for initialization
		this.name = name;
		this.date = date;
		this.cardno = cardno;
		this.cardtype = cardtype;
	}

	public int getId() {                                                       //we will use the id for the setting the value and getting the value 
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}




}

