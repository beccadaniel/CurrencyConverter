package com.shadedaniel.android.currencyconverter.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by becca on 11/1/17.
 */

public class ExchangeRate {

    public String currencyName;
    public String currencyRep;
    public double btc;
    public double eTH;

    public ExchangeRate(String currencyName, String currencyRep, double btc, double eTH) {
        this.currencyName = currencyName;
        this.currencyRep = currencyRep;
        this.btc = btc;
        this.eTH = eTH;
    }
}