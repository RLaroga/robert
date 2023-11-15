package DesignPattern.Factory.CURRENCY.factory;

import DesignPattern.Factory.CURRENCY.service.MethodCurrency;
import DesignPattern.Factory.CURRENCY.service.impl.PHPCurrency;
import DesignPattern.Factory.CURRENCY.service.impl.USDCurrency;

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
