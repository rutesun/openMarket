package com.intellicode.openMarket.vo.product;

/**
 * Created by rutes_000 on 2015-06-04.
 */
public class ChangeInventory {
    private int id;
    private String code;
    private int changedInventoryAmount;

    public ChangeInventory(String code, int changedInventoryAmount) {
        this.code = code;
        this.changedInventoryAmount = changedInventoryAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getChangedInventoryAmount() {
        return changedInventoryAmount;
    }

    public void setChangedInventoryAmount(int changedInventoryAmount) {
        this.changedInventoryAmount = changedInventoryAmount;
    }
}
