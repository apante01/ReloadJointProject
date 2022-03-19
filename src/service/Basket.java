package service;

import product.Product;
import thread.ThreadBasket;

import java.util.HashSet;
import java.util.Set;

public class Basket implements Buy {
    private String nameBasket;
    public int basketCapacity=1;

    public Basket() {
    }

    public Basket(String nameBasket) {
        this.nameBasket = nameBasket;
    }
    private Set<Product> basket = new HashSet<>();

    @Override
    public Product findProduct(String nameProduct) {
        return null;
    }

    @Override
    public Set<Product> findProducts(int price) {
        return null;
    }

    @Override
    public Set<Product> putInBasket(Product product) {
        basket.add(product);
        return basket;
    }





    public String getNameBasket() {
        return nameBasket;
    }

    public void setNameBasket(String nameBasket) {
        this.nameBasket = nameBasket;
    }

    public Set<Product> getBasket() {
        return basket;
    }

    public void setBasket(Set<Product> basket) {
        this.basket = basket;
    }
}