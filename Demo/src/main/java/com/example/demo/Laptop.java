package com.example.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")

public class Laptop {
	private int lid;
	private String brand;

	public Laptop() {
		System.out.println("Laptop Object created..");
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void brandname(String str) {
		System.out.println("This is my laptop " + str);
	}

}
