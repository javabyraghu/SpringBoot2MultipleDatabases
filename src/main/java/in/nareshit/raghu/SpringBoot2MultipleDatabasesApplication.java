package in.nareshit.raghu;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.nareshit.raghu.model.customer.Customer;
import in.nareshit.raghu.model.product.Product;
import in.nareshit.raghu.repo.customer.CustomerRepository;
import in.nareshit.raghu.repo.product.ProductRepository;

@SpringBootApplication
public class SpringBoot2MultipleDatabasesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2MultipleDatabasesApplication.class, args);
	}

	@Autowired
	private ProductRepository productRepo;

	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public void run(String... args) throws Exception {
		productRepo.saveAll(
				Arrays.asList(
						new Product(101, "P-1", "PEN"),
						new Product(102, "P-2", "BOOK"),
						new Product(103, "P-3", "TEST")
						)
				);

		customerRepo.saveAll(
				Arrays.asList(
						new Customer(550, "sam@gmail.com", "sam"),
						new Customer(551, "ram@gmail.com", "ram"),
						new Customer(552, "khan@gmail.com", "khan")
						)
				);
	}

}
