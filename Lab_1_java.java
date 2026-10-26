/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Zidrek_Ilisan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Lab_1_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

            // Problem 1 //
            System.out.println("Enter your age");
            int age = input.nextInt();
            if (age < 13) {
                System.out.println("You are a child");
            } else if (age <= 19) {
                System.out.println("You are a teenager");
            } else {
                System.out.println("You are an adult");

            //Problem 2 //
            System.out.println("Enter today's temperature in Celsius");
            double temperature = input.nextDouble();
            if (temperature < 0) {
                System.out.println("Freezing point");
            } else if (temperature <= 25) {
                System.out.println("Normal weather");
            } else {
                System.out.println("Hot weather");

                //problem 3 //
                System.out.println("Enter your test score");
                double test_score = input.nextDouble();

                if (test_score <= 74) {
                    System.out.println("Needs improvement");
                } else if (test_score >= 75 && test_score <= 100) {
                    System.out.println("Good");

                } else {
                    System.out.println("Excellent");

                    // Problem 4 //
                    System.out.println("Enter the radius of the circle");
                    double radius = input.nextDouble();
                    if (radius <= 0) {
                        System.out.println("Invalid radius");
                    } else {
                        double area = Math.PI * radius * radius;
                        double circumference = 2 * Math.PI * radius;
                        System.out.println("Area: " + area);
                        System.out.println("Circumference: " + circumference);

                    }
                }
            }
        }
    }
}