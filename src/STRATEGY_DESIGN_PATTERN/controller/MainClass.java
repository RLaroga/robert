package STRATEGY_DESIGN_PATTERN.controller;

import STRATEGY_DESIGN_PATTERN.service.Impl.CreditCardPayment;
import STRATEGY_DESIGN_PATTERN.service.Impl.PayPalPayment;
import STRATEGY_DESIGN_PATTERN.service.PaymentStrategy;
import STRATEGY_DESIGN_PATTERN.strategy.ShoppingCart;

public class MainClass {

    public static void main (String [] args) {

        /**
         * Instantiate the ShoppingCart strategy class
         */
        ShoppingCart shoppingCart = new ShoppingCart();

        /**
         * Create a strategy method (CreditCardPayment)
         */
        PaymentStrategy creditCardPayment = new CreditCardPayment("123456", "654321");
        /**
         * Create a strategy method (PayPalPayment)
         */
        PaymentStrategy payPalPayment = new PayPalPayment("rlaroga@gmail.com");

        /**
         * Call the instantiated class method "setPaymentStrategy" and pass the preferred strategy
         * method to be use (creditCardPayment)
         */
        shoppingCart.setPaymentStrategy(creditCardPayment);
        shoppingCart.checkOut(200);

        /**
         * Call the instantaited class method "setPaymentStrategy" and pass the preferred strategy
         * method to be use (payPalPayment)
         */
        shoppingCart.setPaymentStrategy(payPalPayment);
        shoppingCart.checkOut(5000);

    }
}
