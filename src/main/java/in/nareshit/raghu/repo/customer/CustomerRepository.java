package in.nareshit.raghu.repo.customer;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.customer.Customer;

public interface CustomerRepository 
extends JpaRepository<Customer, Integer> {

}
