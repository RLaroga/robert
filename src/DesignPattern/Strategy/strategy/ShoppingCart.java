package DesignPattern.Strategy.strategy;

import DesignPattern.Strategy.service.PaymentStrategy;

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(int amount) {
        paymentStrategy.pay(amount);
    }

}
