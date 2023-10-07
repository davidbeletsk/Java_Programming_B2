package day10_if_statements;

public class CheckCharacter {

    /*
    create a char variable with a letter (can only do this one hardcoded, no Scanner method for char)
find out if the letter is an uppercase letter or lowercase letter. Print the type of letter it is

    ex:
        'b'
        lowercase

    ex:
        'U'
        uppercase
     */

    public static void main(String[] args) {
        char letter = 'A';



        /*
            if uppercase -- > A >= letter <= Z --- > A >= A >= letter && letter <= Z
                print uppercase

            else
         */

        if ('A' <= letter && letter <= 'Z') {
            System.out.println("UPPERCASE");
        }

        if ('a' <= letter && letter <= 'z') {
            System.out.println("lowercase");
        }
    }
}
