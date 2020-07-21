package in.nareshit.raghu.repo.product;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.model.product.Product;

public interface ProductRepository 
extends JpaRepository<Product, Integer> {

}
