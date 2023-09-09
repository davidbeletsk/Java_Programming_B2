package day05_variables;

public class MyName {

    /*
            create a class MyName
            create a main method
            create multiple char variables, one for each letter of your name
            print your name
                print each letter in a different line
                print your name in the same line
     */

    public static void main(String[] args) {

        char first = 'D';
        char second = 'a';
        char third = 'v';
        char fourth = 'y';
        char fifth = 'd';

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
        System.out.println(fifth);

        String myName = "" + first + second + third + fourth + fifth;

        System.out.println(myName);



    }


}
