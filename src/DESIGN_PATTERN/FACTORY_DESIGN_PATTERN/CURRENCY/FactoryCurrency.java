package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.CURRENCY;

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
