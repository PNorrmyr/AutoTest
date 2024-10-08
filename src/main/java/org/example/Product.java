package org.example;

public class Product {

    private int Id;
    private int price;
    private String ProductName;
    private boolean available;



    public Product(int Id, int price, String productName, boolean isAvailable) {
        this.Id = Id;
        this.price = price;
        this.ProductName = productName;
        this.available = isAvailable;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
