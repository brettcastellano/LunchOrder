/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lunchorder;

/**
 *
 * @author brcas1396
 */
public class Food {
    private int quantity;
    private double price;
    private double fat;
    private double carbs;
    private double fiber;
    static private double orderAmount;
    
    public Food(int quantity1, double p, double fat1, double carbs1, double fiber1) {
    quantity = quantity1;
    price = p;
    fat = fat1;
    carbs = carbs1;
    fiber = fiber1;
    orderAmount += quantity1*p;
    }
    
    public static double returnPrice() {      
        return orderAmount;
    }
    
    public String returnFacts() {
        String misc;
        misc = (fat + "g of fat, " + carbs + "g of carbs, and " + fiber + "g of fiber.");
        return misc;
    }
    
}
