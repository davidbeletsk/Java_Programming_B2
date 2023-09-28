package day13_string;

import day04_variables.ShoppingReceipt;

public class StringMemory {


    public static void main(String[] args) {


        String first = "java";

        String second = new String("java");

        String third = "java";

        String fourth = new String("java");

        System.out.println(first == second);
        System.out.println(first == third);
        System.out.println(second == fourth);

    }
}
