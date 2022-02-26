package service;

import product.Product;

import java.util.Set;

public interface Buy {

    Product findProduct(String name);

    Set<Product> findProducts(int price);

    Set<Product> putInBasket(Product product);
}

