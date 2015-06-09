package com.intellicode.openMarket.util.enums;

/**
 * 사용자가 구매 -> 배송 요청
 * 판매자가 준비 버튼 클릭 -> 배송 준비
 * 일정 시간 후 -> 배송 중
 * 일정 시간 후 -> 배송 완료
 */
public enum ShippingState {
    REQUEST(0, "배송요청"),
    PREPARE(1, "배송준비"),
    TRANSIT(2, "배송중"),
    COMPLETE(3, "배송완료");

    private int value;
    private String state = null;

    ShippingState(int value, String state){
        this.value = value;
        this.state = state;
    }

    public ShippingState getIndex(int idx){
        return ShippingState.values()[idx];
    }

    public int getValue() {
        return value;
    }

    public String getState() {
        return state;
    }
}
