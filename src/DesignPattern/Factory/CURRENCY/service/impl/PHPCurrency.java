package DesignPattern.Factory.CURRENCY.service.impl;

import DesignPattern.Factory.CURRENCY.enums.CurrencyEnum;
import DesignPattern.Factory.CURRENCY.service.MethodCurrency;

public class PHPCurrency implements MethodCurrency {
    @Override
    public String value() {
        StringBuilder sb = new StringBuilder();
        sb.append("Congratulations, you have ");
        sb.append(CurrencyEnum.getSymbolByIndex(1));
        sb.append("1,000,000");

        return sb.toString();
    }

}
