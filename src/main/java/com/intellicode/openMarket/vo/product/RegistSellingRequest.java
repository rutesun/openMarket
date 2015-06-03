package com.intellicode.openMarket.vo.product;

/**
 * Created by rutes_000 on 2015-06-03.
 */
public class RegistSellingRequest extends BaseProduct{
    private String startTimestamp;
    private String endTimestamp;
    private int sellingAmount;

    public String getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(String startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public String getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(String endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public int getSellingAmount() {
        return sellingAmount;
    }

    public void setSellingAmount(int sellingAmount) {
        this.sellingAmount = sellingAmount;
    }
}
