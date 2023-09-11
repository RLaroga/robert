package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.CURRENCY.service.impl;

import DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.CURRENCY.enums.CurrencyEnum;
import DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.CURRENCY.service.MethodCurrency;

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
