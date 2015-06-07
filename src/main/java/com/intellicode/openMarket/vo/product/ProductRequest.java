package com.intellicode.openMarket.vo.product;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by rutes_000 on 2015-06-01.
 */
public class ProductRequest extends BaseProduct{
    private int price;

    private String info;
    private String spec;

    private String imageUrl;
    private String thumbnailUrl;

    private MultipartFile image;
    private MultipartFile thumbnail;

    private int amount;
    private int inventoryAmount;
    private int selledAmount;

    private String classification1;
    private String classification2;
    private String classification3;
    private String classification4;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

    public MultipartFile getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(MultipartFile thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getInventoryAmount() {
        return inventoryAmount;
    }

    public void setInventoryAmount(int amount) {
        this.inventoryAmount = amount;
    }

    public int getSelledAmount() {
        return selledAmount;
    }

    public void setSelledAmount(int selledAmount) {
        this.selledAmount = selledAmount;
    }

    public String getClassification1() {
        return classification1;
    }

    public void setClassification1(String classification1) {
        this.classification1 = classification1;
    }

    public String getClassification2() {
        return classification2;
    }

    public void setClassification2(String classification2) {
        this.classification2 = classification2;
    }

    public String getClassification3() {
        return classification3;
    }

    public void setClassification3(String classification3) {
        this.classification3 = classification3;
    }

    public String getClassification4() {
        return classification4;
    }

    public void setClassification4(String classification4) {
        this.classification4 = classification4;
    }
}
