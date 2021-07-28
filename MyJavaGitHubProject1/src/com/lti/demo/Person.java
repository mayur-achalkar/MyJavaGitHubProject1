package com.lti.demo;

public class Person {
	private int pId;
	private String pName;
	private int pSalary;
	public Person() {
		super();
	}
	public Person(int pId, String pName, int pSalary) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pSalary = pSalary;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpSalary() {
		return pSalary;
	}
	public void setpSalary(int pSalary) {
		this.pSalary = pSalary;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pSalary=" + pSalary + "]";
	}
	
	

}
