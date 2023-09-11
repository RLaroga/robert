package FACTORY_DESIGN_PATTERN.CURRENCY.factory;

import FACTORY_DESIGN_PATTERN.CURRENCY.service.MethodCurrency;
import FACTORY_DESIGN_PATTERN.CURRENCY.service.impl.PHPCurrency;
import FACTORY_DESIGN_PATTERN.CURRENCY.service.impl.USDCurrency;

public class FactoryCurrency {


    public MethodCurrency createCurrency(String name) {

        if(name == null) {
            return null;
        }

        if(name.equalsIgnoreCase("PHP")) {
            return new PHPCurrency();
        } else if (name.equalsIgnoreCase("USD")) {
            return new USDCurrency();
        }

        return null;
    }

}
