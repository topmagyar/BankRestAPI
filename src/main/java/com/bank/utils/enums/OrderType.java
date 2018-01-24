package com.bank.utils.enums;

/**
 * Created by bobyk on 1/24/18.
 */
public enum OrderType {
    BUY("buy"),
    SELL("sell");

    private String value;

    OrderType(String value) {
        this.value = value;
    }

    public String value() {
        return this.value;
    }
}
