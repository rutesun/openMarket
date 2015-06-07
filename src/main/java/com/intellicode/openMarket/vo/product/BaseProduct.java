package com.intellicode.openMarket.vo.product;

/**
 * Created by rutes_000 on 2015-06-03.
 */
public class BaseProduct {
    private String id;
    private String code;
    private String companyId;
    private String name;

    public BaseProduct() {
    }

    public BaseProduct(String code, String companyId) {
        this.code = code;
        this.companyId = companyId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
