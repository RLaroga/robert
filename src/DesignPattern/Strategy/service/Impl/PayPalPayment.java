package DesignPattern.Strategy.service.Impl;

import DesignPattern.Factory.CURRENCY.enums.CurrencyEnum;
import DesignPattern.Strategy.service.PaymentStrategy;

public class PayPalPayment implements PaymentStrategy {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        StringBuilder sb = new StringBuilder();

        sb.append("You have paid an amount of ");
        sb.append(CurrencyEnum.getSymbolByIndex(1));
        sb.append(amount);
        sb.append(" using PayPal Thank you");

        System.out.println(sb.toString());
    }
}
