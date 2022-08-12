package com.springboot.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="card")
public class Car{
	
	private int id;
	private String colour;
	private int prize;
	private String fuel;
	private String wheel;
	
	public Car() {
		
	}
	
	public Car(String colour, int prize, String fuel, String wheel) {
		super();
		this.colour = colour;
		this.prize = prize;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}
	
	
	
	
	

	
}
