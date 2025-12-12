package edu.estatuas.coinconversor.entity;

import java.util.HashMap;

public class Coin {



    private float amount;
    private String base;
    private String date;
    private HashMap<String, Double> rates;

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public HashMap<String, Double> getRates() {
        return rates;
    }

    public void setRates(HashMap rates) {
        this.rates = rates;
    }
}