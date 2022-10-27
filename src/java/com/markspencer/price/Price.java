package com.markspencer.price;

import java.util.Arrays;
import java.util.List;

public class Price {

    private String id;
    private String amount;
    private String detail;

    public Price(String id, String amount, String detail) {
        this.id = id;
        this.amount = amount;
        this.detail = detail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    private static List<Price> prices = Arrays.asList(
            new Price("12", "23.2", "Harry Potter and the Philosopher's Stone"),
            new Price("23", "45.6", "Price-2"),
            new Price("45", "56.7", "Interview with the vampire")
    );

    public static Price getById(String id) {
        System.out.println("Inside getById");
        return prices.stream().filter(price -> price.getId().equals(id)).findFirst().orElse(null);
    }


    @Override
    public String toString() {
        return "Price{" +
                "id=" + id +
                ", amount=" + amount +
                ", detail='" + detail + '\'' +
                '}';
    }
}
