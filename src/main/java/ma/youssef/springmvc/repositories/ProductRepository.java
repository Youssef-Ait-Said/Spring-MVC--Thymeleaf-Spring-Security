package ma.youssef.springmvc.repositories;

import ma.youssef.springmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
