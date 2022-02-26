package product;

import dataBase.ProductDataBase;

import java.util.ArrayList;

public abstract class Product {
    private String nameProduct;
    private String brand;
    private int price;
    private String description;
    private int article;

    public Product(String nameProduct, String brand, int price, String description,int article) {
        this.nameProduct = nameProduct;
        this.brand = brand;
        this.price = price;
        this.description = description;
        this.article = article;
    }
    public Product(){

    }
    public static ProductDataBase addAllProductDataBase() {
        ProductDataBase productDataBase = new ProductDataBase();
        SmartPhone smartPhone = new SmartPhone();
        Laptop laptop = new Laptop();
        Tv tv = new Tv();
        productDataBase.addInDataBase((ArrayList<Product>) smartPhone.smartPhonesList);
        productDataBase.addInDataBase((ArrayList<Product>) tv.tvList);
        productDataBase.addInDataBase((ArrayList<Product>) laptop.laptopList);
        return productDataBase;
    }



    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return "Наименование: " + getNameProduct() + ", " + "Бренд: " + getBrand() + "\n";
    }
}
