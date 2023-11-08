package com.helloworld.greed;

public class CosmeticsName {
    private final String type; // 化粧水、クリーム、美容液
    private final String price; // 値段

    public CosmeticsName(String type, String price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getPrice() {
        return price;
    }
}
