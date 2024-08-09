/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oppcoursework;

/**
 *
 * @author Shakur
 */
public class BalexCompany {
    
    
   

    //calculating   and printing the total pay or print an error in case we come to find it
    public static void calculatePay(double basePay, int hoursWorked) {
        final double MIN_WAGE = 8.00;
        final int MAX_HOURS = 60;
        final int REGULAR_HOURS = 40;

     //  here, we check if the base pay is less than minimum wage .
        if (basePay < MIN_WAGE) {
            System.out.println("Error: Base pay is below minimum wage.");
            return;
        }

        // We now check if the hours worked are more than the maximum allowed hours
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked exceed the maximum allowed.");
            return;
        }

        double totalPay;
        if (hoursWorked <= REGULAR_HOURS) {
            
            // we then calculate regular pay
            totalPay = basePay * hoursWorked;
            
        } else {
            // After, we calculate regular pay for the first 40 hours
            totalPay = basePay * REGULAR_HOURS;
            // Calculate overtime pay
            double overtimePay = (hoursWorked - REGULAR_HOURS) * (basePay * 1.5);
            totalPay += overtimePay;
        }

        // Here we then print the total pay
        System.out.println("Total pay: $" + totalPay);
    }

    public static void main(String[] args) {
        // Employee 1
        double basePay1 = 7.50;
        int hoursWorked1 = 35;
        System.out.print("Employee 1: ");
        calculatePay(basePay1, hoursWorked1);

        // Employee 2
        double basePay2 = 8.20;
        int hoursWorked2 = 47;
        System.out.print("Employee 2: ");
        calculatePay(basePay2, hoursWorked2);

        // Employee 3
        double basePay3 = 10.00;
        int hoursWorked3 = 73;
        System.out.print("Employee 3: ");
        calculatePay(basePay3, hoursWorked3);
    }
}

    
    
    
    

