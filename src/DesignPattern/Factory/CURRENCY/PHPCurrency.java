package DesignPattern.Factory.CURRENCY;

import DesignPattern.Factory.CURRENCY.enums.CurrencyEnum;

public class PHPCurrency implements MethodCurrency{
    @Override
    public String value() {
        StringBuilder sb = new StringBuilder();
        sb.append("Congratulations, you have ");
        sb.append(CurrencyEnum.getSymbolByIndex(1));
        sb.append("1,000,000");

        return sb.toString();
    }

}
