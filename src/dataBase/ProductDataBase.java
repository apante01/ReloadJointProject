package dataBase;

import product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ProductDataBase extends DataBase {

    private Product product;

    public List<ArrayList<Product>> productList = new ArrayList<ArrayList<Product>>();


    @Override
    public List<ArrayList<Product>> addInDataBase(ArrayList<Product> products) {
        productList.add(products);
        return productList;
    }

    @Override
    public Product findProduct(String name) {
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
        return null;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Наименование: " + product.getNameProduct() + ", " + "Бренд: " + product.getBrand() + "\n";
    }
}

