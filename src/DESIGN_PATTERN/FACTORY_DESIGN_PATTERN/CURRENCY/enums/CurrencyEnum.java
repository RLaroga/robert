package DESIGN_PATTERN.FACTORY_DESIGN_PATTERN.CURRENCY.enums;

public enum CurrencyEnum {
    PESO("PHP", 1, "₱"),
    USD("USD", 2, "$");

    private String name;
    private int index;
    private String symbol;

    private CurrencyEnum(String name, int index, String symbol) {
        this.name = name;
        this.index = index;
        this.symbol = symbol;
    }

    //Get method
    public String getName() {
        return name;
    }

    public int getIndex() {
        return index;
    }

    public String getSymbol() {
        return symbol;
    }

    //Set method
    public void setName(String name) {
        this.name = name;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public static String getNameByIndex(int index) {
        for(CurrencyEnum c : CurrencyEnum.values()) {
            if (c.index == index) {
                return c.name;
            }
        }
        return null;
    }

    public static String getSymbolByIndex(int index) {
        for(CurrencyEnum c : CurrencyEnum.values()) {
            if(c.index == index) {
                return c.symbol;
            }
        }
        return null;
    }

}
