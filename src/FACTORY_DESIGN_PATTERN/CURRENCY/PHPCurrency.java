package FACTORY_DESIGN_PATTERN.CURRENCY;

import FACTORY_DESIGN_PATTERN.CURRENCY.enums.CurrencyEnum;

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
