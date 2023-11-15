package DesignPattern.Factory.CURRENCY.service.impl;

import DesignPattern.Factory.CURRENCY.enums.CurrencyEnum;
import DesignPattern.Factory.CURRENCY.service.MethodCurrency;

public class USDCurrency implements MethodCurrency {
    @Override
    public String value() {
        StringBuilder sb = new StringBuilder();
        sb.append("Congratulations, you have ");
        sb.append(CurrencyEnum.getSymbolByIndex(2));
        sb.append("2,000,000");

        return sb.toString();
    }
}
