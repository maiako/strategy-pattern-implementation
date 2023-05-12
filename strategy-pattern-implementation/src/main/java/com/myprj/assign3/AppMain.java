/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.assign3;

import com.myprj.assign3.domain.TShirt;
import com.myprj.assign3.payment.BankTransferPayment;
import com.myprj.assign3.payment.CashPayment;
import com.myprj.assign3.payment.CreditCardPayment;
import com.myprj.assign3.util.Generator;
import java.util.Scanner;

/**
 *
 * @author Μ
 */
public class AppMain {

    public static void main(String[] args) {

        Cart cart1 = new Cart();

        Generator gen = new Generator();

        TShirt er = new TShirt(
                gen.randomColor(),
                gen.randomSize(),
                gen.randomFabric());
        System.out.println(er.toString());

        cart1.addItem(er);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose the method of payment for the Tshirt.");
        System.out.println("1 for Bank Transfer Payment, 2 for Cash Payment, 3 for Credit Card Payment");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("1")) {
            System.out.println("Insert your bank account number");
            String bank = scanner.next();
            cart1.executePayment(new BankTransferPayment(bank));
        } else if (choice.equalsIgnoreCase("2")) {
            cart1.executePayment(new CashPayment());
        } else if (choice.equalsIgnoreCase("3")) {
            System.out.println("Insert your credit card number");
            String card = scanner.next();
            cart1.executePayment(new CreditCardPayment(card));
        }

    }

}
