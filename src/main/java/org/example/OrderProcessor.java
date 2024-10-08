package org.example;

import java.util.ArrayList;

public class OrderProcessor {

    private ProductRepository productRepository;

    public ArrayList<Product> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Product> orderList) {
        this.orderList = orderList;
    }

    private ArrayList<Product> orderList;

    public OrderProcessor(ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.orderList = new ArrayList<>();
    }

    public int getPriceById(int productId){
        Product product = productRepository.getPriceByProductId(productId);
        if (!product.isAvailable()) {
            return -1;
        } else {
            orderList.add(product);
            return product.getPrice();
        }

    }

    public int calculateTotalPrice(){
        int totalPrice = 0;
        for (Product p: orderList) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }
}
