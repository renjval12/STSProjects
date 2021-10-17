package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")

public class Person {
	private int pid;
	private String pname;
	private String tech;

	@Autowired
	private Laptop laptop;

	@Autowired
	private Address addr;

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}

	public Person() {
		System.out.println("Person Object created..");
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {

		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getTech() {
		return tech;
	}

	public void setTech(String tech) {
		this.tech = tech;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public String showLaptop() {
		this.laptop.setBrand("Lenovo Think Book");
		return this.laptop.getBrand();
	}

	public void show() {
		System.out.println("inside person class show method...");
		// laptop.brandname();
	}
	public void brandname() {
		System.out.println("This is brandname method from Person class");
	}
}
