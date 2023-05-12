/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.assign3.payment;

/**
 *
 * @author Μ
 */
public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;

    public CreditCardPayment(String cardNumber) {

        this.cardNumber = cardNumber;

    }

    @Override
    public void pay(double amount) {
        System.out.println("Your payment with Card"
                + this.cardNumber
                + " is successful");
    }

}
