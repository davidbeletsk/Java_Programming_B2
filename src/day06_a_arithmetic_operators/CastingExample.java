package day06_a_arithmetic_operators;

public class CastingExample {

    public static void main(String [] args){

        short numOne = 40;
        float numtwo = numOne;   // short is smaller than float, sp implicit casting happens.

        System.out.println(numOne);
        System.out.println(numtwo);


        float num3 = 100.5F;
        short num4 = (short)num3;   // float is begger, so we must explicitly cast it. Narrowing cast.

        System.out.println(num3);
        System.out.println(num4);










    }
}
