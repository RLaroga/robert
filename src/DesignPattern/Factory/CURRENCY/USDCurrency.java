package DesignPattern.Factory.CURRENCY;

import DesignPattern.Factory.CURRENCY.enums.CurrencyEnum;

public class USDCurrency implements MethodCurrency{
    @Override
    public String value() {
        StringBuilder sb = new StringBuilder();
        sb.append("Congratulations, you have ");
        sb.append(CurrencyEnum.getSymbolByIndex(2));
        sb.append("2,000,000");

        return sb.toString();
    }
}
