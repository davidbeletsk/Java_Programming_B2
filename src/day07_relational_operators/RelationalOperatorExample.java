package day07_relational_operators;

public class RelationalOperatorExample {

    public static void main(String[] args) {

        System.out.println(10 > 5);
        System.out.println(10 < 5);

        int a = 5;
        int b = 3;

        System.out.println(a > b); // true
        System.out.println(a < b); // false

        boolean result1 = a > b;
        System.out.println(result1);
        boolean result2 = a < b;
        System.out.println(result2);


        System.out.println(6 >= 6);
        System.out.println(10 == 10);
        System.out.println(12 != 12);

        System.out.println(a == b); // false

        System.out.println('f' == 'c'); // false // comparing ASCII table numbers
        System.out.println('f' == 'f'); // true   --------^





    }


}
