package com.mapping.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.database.dao.BillingRepo;
import com.mapping.database.dao.CustomerRepo;
import com.mapping.database.dao.ProductRepo;
import com.mapping.database.dao.ShippingAddressRepo;
import com.mapping.database.entity.BillingAddress;
import com.mapping.database.entity.Customer;
import com.mapping.database.entity.Product;
import com.mapping.database.entity.ShippingAddress;

@RestController
public class CrudOperation {

	@Autowired
	private CustomerRepo customerRepo;

	@Autowired
	private ProductRepo productRepo;

	@Autowired
	private ShippingAddressRepo shippingAddressRepo;

	@Autowired
	private BillingRepo billingRepo;

	@GetMapping("/addCustomer")
	public void addCustomer() {
		Customer customer = new Customer();
		customer.setFirst_name("vivek");
		customer.setLast_name("savin");
		customer.setCustomer_phone("7526991496");

		customer = customerRepo.save(customer);
		// creating object of shipping address
		ShippingAddress shippingaddress = new ShippingAddress();

		shippingaddress.setAddress("chandigarh");
		shippingaddress.setCountry("India");
		shippingaddress.setCity("mohali");
		shippingaddress.setZipcode("140307");
		shippingaddress.setCustomer(customer);
		shippingAddressRepo.save(shippingaddress);
		//creating object of billing address
		BillingAddress billingaddress = new BillingAddress();
		billingaddress.setAddress("mohali");
		billingaddress.setCountry("India");
		billingaddress.setCity("sas nagar");
		billingaddress.setCustomer(customer);
		billingRepo.save(billingaddress);

	}

	@PostMapping("/addProduct")
	public void addProduct() {
		Product product = new Product();
		product.setName("One+");
		product.setCategory("Accessories");
		product.setDescription("good quality");
		product.setPrice(23000.00);
		product.setUnit(2);

		productRepo.save(product);
	}
}