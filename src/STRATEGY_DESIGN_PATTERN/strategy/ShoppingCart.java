package STRATEGY_DESIGN_PATTERN.strategy;

import STRATEGY_DESIGN_PATTERN.service.PaymentStrategy;

public class ShoppingCart {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkOut(int amount) {
        paymentStrategy.pay(amount);
    }

}
