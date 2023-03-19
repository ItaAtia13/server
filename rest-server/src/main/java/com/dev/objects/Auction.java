package com.dev.objects;

public class Auction {

    private int id;

    boolean isActive;

    Product product;

    User buyers;

    ///////////////////////Getters and Setters///////////////////////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getBuyers() {
        return buyers;
    }

    public void setBuyers(User buyers) {
        this.buyers = buyers;
    }
}
