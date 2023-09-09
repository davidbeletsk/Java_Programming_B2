package day06_a_arithmetic_operators;

public class House {

    /*
    Create a class House
    create a main method

    - Each the datatype you feel is most appropriate for each variable.

    - Create the following variables:
        house type, number of bedrooms, number of bathrooms, number of kitchens, is there a basement?, is there an attic, is there a pool, is the house for sale?, cost of the house, address, zipcode, is a park near by, Rating of surrounding school districts (out of 5),

    - Print each variable with a message with the value
        Ex: The number of bedrooms is: 4
            The number of bathrooms is: 3
     */

    public static void main(String [] args){

        String housetype = "Single House";
        int numberOfBedrooms = 5;
        int numberOfBathroom = 3;
        int numberOfKitchen = 2;
        boolean hasBasement = true;
        boolean hasAttic = false;
        boolean isOnSale = false;
        double price = 9_999_999.99;
        boolean isThereAPool = true;
        String address = "3744 Intellij Avenue, MD";
        int zipcode = 12345;
        boolean hasPark = true;

        String result = "The " + housetype + " on " + address + ", " + zipcode + " costs " + price + " The " + housetype + " has " + numberOfBathroom + " bathrooms, has " +
                numberOfBedrooms + " bedrooms, and has " + numberOfKitchen + " kitchen, \nIt also includes a baseent: " + hasBasement + " has an attic: " + hasAttic +
                " and, has a park: ";

    }
}
