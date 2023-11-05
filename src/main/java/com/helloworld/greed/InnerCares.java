package com.helloworld.greed;

public class InnerCares {
    private final String productName;//商品名
    private final String expirationDate;//賞味期限


    public InnerCares(String productName, String expirationDate) {
        this.productName = productName;
        this.expirationDate = expirationDate;
    }

    public String getProductName() {
        return productName;
    }

    public String getExpirationDate() {
        return expirationDate;
    }
}
