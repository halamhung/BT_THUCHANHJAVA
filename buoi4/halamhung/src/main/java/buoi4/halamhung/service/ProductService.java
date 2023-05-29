package buoi4.halamhung.service;

import buoi4.halamhung.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void saveProduct (Product product);
    Product getProductById(int id);

    void deleteProductById(int id);
}
