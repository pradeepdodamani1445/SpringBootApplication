package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MoveInSyncController {
	@Autowired
	RepoInterface repo;
	
	
	@PostMapping("addcustomers")
	public String addCustomers(@RequestParam Customers cust,@RequestParam PurchaseOrder po, @RequestParam ShippingDetails sd )
	{
		repo.save(cust);
		repo.save(po);
		repo.save(sd);
		return "Success";
	}
	
	@ResponseBody
	@GetMapping("customers")
	public String getCustomers()
	{
		return repo.findAll().toString();
	}
	@ResponseBody
	@GetMapping("customerscity")
	public String getPurchaseOrder()
	{
		return repo.findAllById(city).toString();
	}
	@ResponseBody
	@GetMapping("customerspurchase")
	public String getCustomerPurchase()
	{
		return repo.findAllById(PurchaseId).toString();
	}
	@ResponseBody
	@GetMapping("customerspurchaseshipment")
	public String getCustomerPurchaseShipment()
	{
		return repo.findAllById(Customers).toString();
	}
}
