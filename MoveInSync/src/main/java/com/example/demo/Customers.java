package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Customers {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String city;
	private long mnumber;
	
	public int getId() {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getMnumber() {
		return mnumber;
	}
	public void setMnumber(long mnumber) {
		this.mnumber = mnumber;
	}
	@Override
	public String toString() {
		return "Customers [id=" + id + ", name=" + name + ", email=" + email + ", city=" + city + ", mnumber=" + mnumber
				+ "]";
	}
}
