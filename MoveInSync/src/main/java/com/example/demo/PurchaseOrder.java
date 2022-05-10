package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
public class PurchaseOrder {
	@Autowired
	@Id
	@GeneratedValue
	private int PurchaseOrderId;
	private Customers Customer;
	private int Quantity;
	private float price;
	private float MRP;
	public int getPurchaseOrderId() {
		return PurchaseOrderId;
	}
	public void setPurchaseOrderId(int purchaseOrderId) {
		PurchaseOrderId = purchaseOrderId;
	}
	public Customers getCustomer() {
		return Customer;
	}
	public void setCustomer(Customers customer) {
		Customer = customer;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getMRP() {
		return MRP;
	}
	public void setMRP(float mRP) {
		MRP = mRP;
	}
	@Override
	public String toString() {
		return "PurchaseOrder [PurchaseOrderId=" + PurchaseOrderId + ", Customer=" + Customer + ", Quantity=" + Quantity
				+ ", price=" + price + ", MRP=" + MRP + "]";
	}
	
}
