package service;

import product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Basket implements Buy {
    private String nameBasket;

    public Basket(String nameBasket) {
        this.nameBasket = nameBasket;
    }
    private List<Product> basket = new ArrayList<>();

    @Override
    public Product findProduct(String nameProduct) {
        return null;
    }

    @Override
    public Set<Product> findProducts(int price) {
        return null;
    }

    @Override
    public List<Product> findAllProducts() {
        return null;
    }

    @Override
    public List<Product> putInBasket(Product product) {
        basket.add(product);
        return basket;
    }

    public String getNameBasket() {
        return nameBasket;
    }

    public void setNameBasket(String nameBasket) {
        this.nameBasket = nameBasket;
    }

    public List<Product> getBasket() {
        return basket;
    }

    public void setBasket(List<Product> basket) {
        this.basket = basket;
    }
}
