package DesignPattern.Strategy.controller;

import DesignPattern.Strategy.service.Impl.CreditCardPayment;
import DesignPattern.Strategy.service.Impl.PayPalPayment;
import DesignPattern.Strategy.service.PaymentStrategy;
import DesignPattern.Strategy.strategy.ShoppingCart;

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
