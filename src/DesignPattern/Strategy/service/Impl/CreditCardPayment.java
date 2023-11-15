package DesignPattern.Strategy.service.Impl;

import DesignPattern.Factory.CURRENCY.enums.CurrencyEnum;
import DesignPattern.Strategy.service.PaymentStrategy;

public class CreditCardPayment implements PaymentStrategy {

    private String cardNumber;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }


    @Override
    public void pay(int amount) {

        StringBuilder sb = new StringBuilder();
        sb.append("You have paid an amount of ");
        sb.append(CurrencyEnum.getSymbolByIndex(1));
        sb.append(amount);
        sb.append(" using Credit Card Thank you");

        System.out.println(sb.toString());

    }
}
