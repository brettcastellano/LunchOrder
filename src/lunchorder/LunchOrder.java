/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lunchorder;

import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author brcas1396
 */
public class LunchOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numBurgs;
        int numSalads;
        int numFries;
        int numSodas;

        System.out.println("Enter number of hamburgers: ");
        numBurgs = input.nextInt();

        System.out.println("Enter number of salads: ");
        numSalads = input.nextInt();

        System.out.println("Enter number of fries: ");
        numFries = input.nextInt();

        System.out.println("Enter number of sodas: ");
        numSodas = input.nextInt();

        Food burger = new Food(numBurgs, 1.85, 9, 33, 1);
        Food salad = new Food(numSalads, 2.00, 1, 11, 5);
        Food fries = new Food(numFries, 1.30, 11, 36, 4);
        Food soda = new Food(numSodas, 0.95, 0, 38, 0);

        System.out.println("Each burger has " + burger.returnFacts());
        System.out.println("Each salad has " + salad.returnFacts());
        System.out.println("Each fries has " + fries.returnFacts());
        System.out.println("Each soda has " + soda.returnFacts());

        System.out.println("Your order will come to: " + Food.returnPrice());
    }

}
