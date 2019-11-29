package com;

public class Address {

	int aid;
	String city;
	String state;
	int zipCode;
	String adrsLine;
	
	Person person;

	public Address() {
		
	}
	public Address(int aid, String city, String state, int zipCode, String adrsLine, Person person) {


		this.aid = aid;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.adrsLine = adrsLine;
		this.person = person;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public String getAdrsLine() {
		return adrsLine;
	}

	public void setAdrsLine(String adrsLine) {
		this.adrsLine = adrsLine;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", city=" + city + ", state=" + state + ", zipCode=" + zipCode + ", adrsLine="
				+ adrsLine + ", person=" + person + "]";
	}
	
	
	
}
