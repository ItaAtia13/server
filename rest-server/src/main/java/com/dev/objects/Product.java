package com.dev.objects;
import java.awt.Image;
import java.time.DateTimeException;
import java.util.Date;

public class Product {
    private int productId;

    private String name;

    private String description;

    private int price;

    private int sellerId;

    private int buyerId;

    Date startAuctionDate;

    Date endAuctionDate;

    Image imageUrl;

    private int numOfOffers;

    private boolean isForSale;

    /////////////////Getters and Setters//////////////////////////////////////////////


    public int getProductId() {
        return productId;
    }

    public void setProduct_id(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(int buyerId) {
        this.buyerId = buyerId;
    }

    public Date getStartAuctionDate() {
        return startAuctionDate;
    }

    public void setStartAuctionDate(Date startAuctionDate) {
        this.startAuctionDate = startAuctionDate;
    }

    public Date getEndAuctionDate() {
        return endAuctionDate;
    }

    public void setEndAuctionDate(Date endAuctionDate) {
        this.endAuctionDate = endAuctionDate;
    }

    public Image getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Image imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getNumOfOffers() {
        return numOfOffers;
    }

    public void setNumOfOffers(int numOfOffers) {
        this.numOfOffers = numOfOffers;
    }

    public boolean isForSale() {
        return isForSale;
    }

    public void setForSale(boolean forSale) {
        isForSale = forSale;
    }
}
