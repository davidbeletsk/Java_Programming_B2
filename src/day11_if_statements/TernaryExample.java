package day11_if_statements;

public class TernaryExample {
    public static void main(String[] args) {

        int a = 4;
        String evenOrOdd = "";

        if (a % 2 == 0) {
            evenOrOdd = "Even";
            System.out.println(evenOrOdd);
        } else {
            evenOrOdd = "Odd";
            System.out.println(evenOrOdd);
        }

        // In Java, there is shorter SYNTAX version of if else
        evenOrOdd = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);
        /*
                     (a % 2 == 0)   ------ > condition
                     ?              ------ > if TRUE or FALSE
                     "Even"         ------ > first value is always for TRUE
                     :              ------ > else
                     "Odd"          ------ > second value is always for FALSE

                     firstValue and secondValue HAS TO BE SAME DATA TYPE
         */


        int num = 4;
        String result = (num > 10)? "BiggerThanTen" : "NotBiggerThanTen";
        System.out.println(result);


        int number = -4;
        String sign = (number > 0) ? "positive" : (number < 0) ? "negative" : "Zero";
        System.out.println(sign);
        //String sign = (number > 0) ? "positive" :"negative";
        /*
                SYNTAX
                        (condition) ? value1 : value2
         */

        // This is same as the one above.
        if (number > 0) {
            sign = "positive";
            System.out.println(sign);
        } else  {
            if (number < 0 ) {
                sign = "negative";
                System.out.println(sign);
            } else {
                sign = "zero";
                System.out.println(sign);
            }
        }




    }
}