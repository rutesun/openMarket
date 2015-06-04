package com.intellicode.openMarket.vo.product;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by rutes_000 on 2015-06-01.
 */
public class ProductRequest extends BaseProduct{
    private String name;
    private int price;

    private String info;
    private String spec;

    private String imageUrl;
    private String thumbnailUrl;

    private MultipartFile image;
    private MultipartFile thumbnail;

    private int inventoryAmount;
    private int selledAmount;

    private String classification11;
    private String classification12;
    private String classification13;
    private String classification14;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    public String getClassification11() {
        return classification11;
    }

    public void setClassification11(String classification11) {
        this.classification11 = classification11;
    }

    public String getClassification12() {
        return classification12;
    }

    public void setClassification12(String classification12) {
        this.classification12 = classification12;
    }

    public String getClassification13() {
        return classification13;
    }

    public void setClassification13(String classification13) {
        this.classification13 = classification13;
    }

    public String getClassification14() {
        return classification14;
    }

    public void setClassification14(String classification14) {
        this.classification14 = classification14;
    }


}
