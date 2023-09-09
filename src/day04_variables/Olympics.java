package day04_variables;

public class Olympics {

    /*
        class name Olympics

            create a variable for the year
            print the country and year for next couple events
            reassign year value each time. Country name is hard coded

            data:

                China 2022
                France 2024
                Italy 2026

            Look forward to the year $year for the Olympics to be in $location

     */

    public static void main(String [] args) {

        System.out.println("The Olympic will be in this locations for the coming years");

        int China = 2022;
        int France = 2024;
        int Italy = 2026;

        System.out.println(" In the year of " + China + ", the Olympic will happen in China");

        System.out.println(" In the year of " + France + ", the Olympic will happen in France");

        System.out.println(" In the year of " + Italy + ", the Olympic will happen in Italy");


        int year;


        year = 2022;
        System.out.println(" In the year of " + year + ", the Olympic will happen in China");

        year = 2026;
        System.out.println(" In the year of " + year + ", the Olympic will happen in France");

        year = 2030;
        System.out.println(" In the year of " + year + ", the Olympic will happen in Italy");







    }
}
