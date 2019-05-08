/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

/**
 *
 * @author jacob.merow
 */
public class PurchaseCalculator {
    public static void main(String[] args){

        final double ITEM_PRICE = 100.00;
        System.out.println("Hard-coded price value: $" + ITEM_PRICE);

        displayPriceWithTax(ITEM_PRICE);
}

    public static void displayPriceWithTax(double price){

        final double TAX_RATE = 0.075;

        double totalPrice = price * (1 + TAX_RATE);
        System.out.println("Total price with tax: $" + totalPrice);
    }
    
    public static void computePriceAfterDiscount(double price, double discount){
        double finalPrice = price - (price * discount);
        System.out.println("Price after discount: $" + finalPrice);

    }
}