package com.intellicode.openMarket.vo.product;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by rutes_000 on 2015-06-01.
 */
public class ProductRequest {
    private String name;
    private String code;
    private int price;

    private String info;
    private String spec;

    private String imageUrl;
    private String thumbnailUrl;

    private MultipartFile image;
    private MultipartFile thumbnail;

    private int amount;
    private int selledAmount;

    public ProductRequest() { }

    public ProductRequest(String name, String code, int price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getSelledAmount() {
        return selledAmount;
    }

    public void setSelledAmount(int selledAmount) {
        this.selledAmount = selledAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductRequest)) return false;

        ProductRequest that = (ProductRequest) o;

        if (getPrice() != that.getPrice()) return false;
        if (getAmount() != that.getAmount()) return false;
        if (getSelledAmount() != that.getSelledAmount()) return false;
        if (getName() != null ? !getName().equals(that.getName()) : that.getName() != null) return false;
        if (getCode() != null ? !getCode().equals(that.getCode()) : that.getCode() != null) return false;
        if (getInfo() != null ? !getInfo().equals(that.getInfo()) : that.getInfo() != null) return false;
        if (getSpec() != null ? !getSpec().equals(that.getSpec()) : that.getSpec() != null) return false;
        if (getImageUrl() != null ? !getImageUrl().equals(that.getImageUrl()) : that.getImageUrl() != null)
            return false;
        if (getThumbnailUrl() != null ? !getThumbnailUrl().equals(that.getThumbnailUrl()) : that.getThumbnailUrl() != null)
            return false;
        if (getImage() != null ? !getImage().equals(that.getImage()) : that.getImage() != null) return false;
        return !(getThumbnail() != null ? !getThumbnail().equals(that.getThumbnail()) : that.getThumbnail() != null);

    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getCode() != null ? getCode().hashCode() : 0);
        result = 31 * result + getPrice();
        result = 31 * result + (getInfo() != null ? getInfo().hashCode() : 0);
        result = 31 * result + (getSpec() != null ? getSpec().hashCode() : 0);
        result = 31 * result + (getImageUrl() != null ? getImageUrl().hashCode() : 0);
        result = 31 * result + (getThumbnailUrl() != null ? getThumbnailUrl().hashCode() : 0);
        result = 31 * result + (getImage() != null ? getImage().hashCode() : 0);
        result = 31 * result + (getThumbnail() != null ? getThumbnail().hashCode() : 0);
        result = 31 * result + getAmount();
        result = 31 * result + getSelledAmount();
        return result;
    }
}
