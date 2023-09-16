package day09_a_scanner;

import java.util.Scanner;

public class Temperature {

    public static void main(String[] args) {

        /*

    Task:
        ask the user to enter the temperature

        if the temperature is above or equal to 70
            print: Its a nice day
                   Go outside, but with your laptop to code java
        if the temperature if less than 70
            print: Its too cold
                   Code more java
     */

        Scanner key = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        int temp = key.nextInt();
        if(temp >= 70){

            System.out.println("Its a nice day\n" +
                    "Go outside, but with your laptop to code java");
        }
        else {

            System.out.println("Its too cold\n" +
                    "Code more java");

        }




    }
}
