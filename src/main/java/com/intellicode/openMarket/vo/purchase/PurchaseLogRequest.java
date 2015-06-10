package com.intellicode.openMarket.vo.purchase;

/**
 * Created by rutes_000 on 2015-06-10.
 */
public class PurchaseLogRequest {
    private String companyId;
    private String productCode;
    private String userId;

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
