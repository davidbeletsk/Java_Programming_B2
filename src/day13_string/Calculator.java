package day13_string;

import java.util.Scanner;

public class Calculator {

    /*
declare and assign 2 number variables
declare and assign a String variable for an operator

create a calculator based on the operator picked
    + : add num1 and num2
    - : minus num1 and num2
    * : multiply num1 and num2
    / : divide num1 and num2
    any other input: "invalid operator"
 */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number - 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter number - 2: ");
        int num2 = input.nextInt();
        System.out.println("Pick Operator: \n\t+\n\t-\n\t*\n\t/\n\t%\n\tEnter: ");
        String operator = input.next();

        int result = 0;
        String message = "";
        boolean runornot = true;

        switch (operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            case "%":
                result = num1 % num2;
                break;
            default:
                message = "Invalid operator";
                runornot = false;
                System.out.println(message);
                break;

        }

        if (runornot) {
            System.out.println("You entered numbers which are " + num1 + " and " + num2 + "\nWhich the " + operator + " operator you selected, the result is: " + result);

        }


    }
}
