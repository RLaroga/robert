package FACTORY_DESIGN_PATTERN.CURRENCY.controller;

import FACTORY_DESIGN_PATTERN.CURRENCY.factory.FactoryCurrency;
import FACTORY_DESIGN_PATTERN.CURRENCY.service.MethodCurrency;
import FACTORY_DESIGN_PATTERN.CURRENCY.enums.CurrencyEnum;
import java.util.Objects;

public class MainCurrency {

    public static void main(String [] args) {

        /**
         * Instantiate the FactoryCurrency class
         */
        FactoryCurrency factoryCurrency = new FactoryCurrency();

        /**
         * Create a phpCurrency object using factoryCurrency method
         */
        MethodCurrency phpCurrency = factoryCurrency.createCurrency(CurrencyEnum.getNameByIndex(1));
        if(Objects.nonNull(phpCurrency)) {
            System.out.println(phpCurrency.value());
        }

        /**
         * Create a usdCurrency object using factoryCurrency method
         */
        MethodCurrency usdCurrency = factoryCurrency.createCurrency(CurrencyEnum.getNameByIndex(2));
        if(Objects.nonNull(usdCurrency)) {
            System.out.println(usdCurrency.value());
        }

    }
}
