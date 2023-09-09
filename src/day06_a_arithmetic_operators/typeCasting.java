package day06_a_arithmetic_operators;

public class typeCasting {

    public static void main(String [] args){

        byte b = 48;
        int i = b;  // the byte valuse is automaticly converted to int, because byte is smaller than int

        System.out.println(b);
        System.out.println(i);


        int i2 = 100;
        byte b2 = (byte)i2;     // int is bigger than byte, so we must cast it. We can yhe int type - i2 to a byte type using (byte)

        System.out.println(i2);
        System.out.println(b2);


        int i3 = 500;
        long l1 = i3; // I am going from small ---> big. int is smaller than long, so it will automatically cast.

        long l2 = 200;
        int i4 = (int)l2;

        System.out.println(l2);
        System.out.println(i4);


        double d = 50; // System.out.println(d); // 50.0
        int i5 = (int)d;


        System.out.println(d);
        System.out.println(i5);


        double d2 = 40;
        byte b3 = (byte)d2;

        System.out.println(d2);
        System.out.println(b3);



    }



}
