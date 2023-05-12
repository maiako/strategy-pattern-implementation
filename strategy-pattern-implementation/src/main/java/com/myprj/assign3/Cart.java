/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myprj.assign3;

import com.myprj.assign3.domain.TShirt;
import java.util.ArrayList;
import java.util.List;
import com.myprj.assign3.payment.PaymentMethod;

/**
 *
 * @author Μ
 */
public class Cart {

    private List<TShirt> orderItems;

    public void Cart() {
        orderItems = new ArrayList<TShirt>();
    }

    public void addItem(TShirt tshirt) {
        if (orderItems == null) {
            orderItems = new ArrayList<TShirt>();
        }
        orderItems.add(tshirt);
    }

    public void removeItem(TShirt tshirt) {
        orderItems.remove(tshirt);
    }

    public double totalOrderCost() {
        double sum = 0.0;

        for (int i = 0; i < orderItems.size(); i++) {
            sum += orderItems.get(i).getPrice();
        }
        return sum;
    }

    public void executePayment(
            PaymentMethod paymentStrategy) {

        double sum = 0.0;
        sum = totalOrderCost();

        paymentStrategy.pay(sum);

    }

}
