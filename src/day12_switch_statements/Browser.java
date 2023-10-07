package day12_switch_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your browser: ");

        String browser = input.nextLine();

        System.out.println("Enter your URL: ");
        String url = input.nextLine();


        switch (browser){
            case "Chrome":
                System.out.println("Opening " + url + " in the " + browser + " browser");
                System.out.println("Loading...");
                break;
            case "Edge":
                System.out.println("Opening " + url + " in the " + browser + " browser");
                System.out.println("Loading....");
                break;
            case "Safari":
                System.out.println("Opening " + url + " in the " + browser + " browser");
                System.out.println("Welcome!");
                break;
            case "Firefox":
                System.out.println("Opening " + url + " in the " + browser + " browser");
                System.out.println("This is home page");
                break;
            default:
                System.out.println(browser + " is not a valid browser type");







        }





    }
}
