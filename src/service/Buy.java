package service;

import product.Product;

import java.util.Collection;
import java.util.List;

public interface Buy {

    Product findProduct(String name);

    Collection<Product> findProducts(int price);

    List<Product> findAllProducts();

    List<Product> putInBasket(Product product);


}
