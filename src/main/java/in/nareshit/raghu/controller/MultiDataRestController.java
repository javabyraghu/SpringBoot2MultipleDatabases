package in.nareshit.raghu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nareshit.raghu.model.customer.Customer;
import in.nareshit.raghu.model.product.Product;
import in.nareshit.raghu.repo.customer.CustomerRepository;
import in.nareshit.raghu.repo.product.ProductRepository;

@RestController
public class MultiDataRestController {

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private CustomerRepository customerRepo;

	@GetMapping("/products")
	public List<Product> getProducts(){
		return productRepo.findAll();
	}
	
	@GetMapping("/customers")
	public List<Customer> getCustomer(){
		return customerRepo.findAll();
	}
}
