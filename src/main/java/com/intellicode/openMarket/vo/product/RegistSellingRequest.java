package com.intellicode.openMarket.vo.product;

/**
 * Created by rutes_000 on 2015-06-03.
 */
public class RegistSellingRequest extends BaseProduct{
    private long startTimestamp;
    private long endTimestamp;
    private int sellingAmount;

    public long getStartTimestamp() {
        return (int) (startTimestamp / 1000L);
    }

    public void setStartTimestamp(long startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public long getEndTimestamp() {
        return (int) (endTimestamp / 1000L);
    }

    public void setEndTimestamp(long endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public int getSellingAmount() {
        return sellingAmount;
    }

    public void setSellingAmount(int sellingAmount) {
        this.sellingAmount = sellingAmount;
    }
}
