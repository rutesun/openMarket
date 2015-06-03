package com.intellicode.openMarket.vo.product;

/**
 * Created by rutes_000 on 2015-06-03.
 */
public class BaseProduct {
    private String id;
    private String code;
    private String companyId;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseProduct)) return false;

        BaseProduct that = (BaseProduct) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getCode() != null ? !getCode().equals(that.getCode()) : that.getCode() != null) return false;
        return !(getCompanyId() != null ? !getCompanyId().equals(that.getCompanyId()) : that.getCompanyId() != null);

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getCode() != null ? getCode().hashCode() : 0);
        result = 31 * result + (getCompanyId() != null ? getCompanyId().hashCode() : 0);
        return result;
    }
}
