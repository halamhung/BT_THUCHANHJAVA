package halamhung.com.BaiTap4.repository;


import halamhung.com.BaiTap4.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}