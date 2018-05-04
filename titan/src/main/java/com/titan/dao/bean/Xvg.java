package com.titan.dao.bean;

public class Xvg {
    private Integer id;

    private String priceBtc;

    private String priceRmb;

    private String quantity;

    private Long time;

    private String tradeType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPriceBtc() {
        return priceBtc;
    }

    public void setPriceBtc(String priceBtc) {
        this.priceBtc = priceBtc == null ? null : priceBtc.trim();
    }

    public String getPriceRmb() {
        return priceRmb;
    }

    public void setPriceRmb(String priceRmb) {
        this.priceRmb = priceRmb == null ? null : priceRmb.trim();
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType == null ? null : tradeType.trim();
    }
}