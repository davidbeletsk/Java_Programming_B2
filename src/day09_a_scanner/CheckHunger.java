package day09_a_scanner;

import java.util.Scanner;

public class CheckHunger {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Are you hungry? Enter: true/false");

        boolean isHungry = input.nextBoolean();

        if (isHungry) {

            System.out.println("You are hungry, so i will order some food");
        }
        else {
            System.out.println("Great, go practice JAVA");

        }
    }
}
