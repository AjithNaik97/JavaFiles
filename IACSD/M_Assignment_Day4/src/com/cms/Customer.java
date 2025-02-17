package com.cms;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int idGenerator;
	
	public Customer(String fname,String lname,String email,String password,double registrationAmount,LocalDate dob,ServicePlan plan)
	{
		this.id=++idGenerator;
		this.fname=fname;
		this.lname=lname;
		this.email=email;
		this.password=password;
		this.registrationAmount=registrationAmount;
		this.dob=dob;
		this.plan=plan;
	}
	
	//Overloaded constructor to wrap primary key.
	public Customer(String email)
	{	
		this.email=email;
	}
	
	public String toString()
	{
		return "Customer ID= "+id+" FName= "+fname+" LName= "+lname+" Email= "+email+" Registration Amount= "+registrationAmount+" DOB= "+dob+" ServicePlan= "+plan+"";
	}
	
	//Override equals method 
	@Override
	public boolean equals(Object o)
	{
		if(o instanceof Customer)
		{
			Customer c=(Customer)o;
			return this.email.equals(c.email);
		}
		return false;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//For natural ordering -- overriding compareTo for ascending order of email.
	@Override
	public int compareTo(Customer cacct)
	{
		return this.email.compareTo(cacct.email);
	}

	public LocalDate getDob() {
		return dob;
	}

	public String getLname() {
		return lname;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}
	
	
}
