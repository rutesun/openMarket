package com.intellicode.openMarket.vo.product;

/**
 * Created by 준현 on 2015-06-07.
 */
public class SearchRequest extends BaseProduct {
    private String classification1;
    private String classification2;
    private String classification3;
    private String classification4;

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
