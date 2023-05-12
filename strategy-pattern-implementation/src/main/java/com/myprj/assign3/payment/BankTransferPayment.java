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
public class BankTransferPayment implements PaymentMethod {

    private String bankAccount;

    public BankTransferPayment(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Your payment using bank transfer, with the following account "
                + this.bankAccount
                + " is successful");
    }
}
