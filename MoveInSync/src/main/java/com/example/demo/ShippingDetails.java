package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class ShippingDetails {
	@Autowired
	@Id
	private Customers customer;
	private PurchaseOrder PurchaseOrder;
	private String Address;
	private String City;
	private long PinCode;
	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	public PurchaseOrder getPurchaseOrder() {
		return PurchaseOrder;
	}
	public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
		PurchaseOrder = purchaseOrder;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public long getPinCode() {
		return PinCode;
	}
	public void setPinCode(long pinCode) {
		PinCode = pinCode;
	}
	@Override
	public String toString() {
		return "ShippingDetails [customer=" + customer + ", PurchaseOrder=" + PurchaseOrder + ", Address=" + Address
				+ ", City=" + City + ", PinCode=" + PinCode + "]";
	}
}
