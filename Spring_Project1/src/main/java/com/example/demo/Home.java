package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype") 
public class Home {
	
	// POJO Class --> Plain Old Java Object -- Getter and setter
	
	public Home() 
	{
		System.out.println("Home Home");
	}
	
	private String owner;
	private int doorno;
	
	@Autowired
	@Qualifier("int1")
	private InternetConnection modem;
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getDoorno() {
		return doorno;
	}
	public void setDoorno(int doorno) {
		this.doorno = doorno;
	}
	
	public void connect()
	{
		/*Tightly coupled
		InternetConnection ic = new InternetConnection();
		ic.switchOn();
		*/
	
		modem.switchOn();
		System.out.println("Connecting to Internet");
	}
	
}
