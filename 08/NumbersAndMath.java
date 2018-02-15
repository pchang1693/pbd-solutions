public class NumbersAndMath {
    public static void main(String[] args) {
        //Prints a statement
        System.out.println("I will now count my chickens:");
        //Calculates 25.0 plus 5.0
        System.out.println("Hens " + (25.0 + 30.0/6.0));
        //Calculates 100 minus the remainder of 75.0 divided by 4.0
        System.out.println("Roosters " + (100.0 - 25.0*3.0%4.0));
        //Prints a statement
        System.out.println("Now I will count the eggs:");
        //Calculates 3.0 + 2.0 + 1.0 - 5.0 + the remainder of 4.0 divided by 2.0 - 1.0 divided by 4.0 + 6.0
        System.out.println(3.0 + 2.0 + 1.0 - 5.0 + 4.0%2.0 - 1.0/4.0 + 6.0);
        //Prints a statement
        System.out.println("Is it true that 3.0 + 2.0 < 5.0 - 7.0?");
        //Prints false because 5.0 is not less than -2.0
        System.out.println(3.0+2.0 < 5.0-7.0);
        //Prints 5.0
        System.out.println("What is 3.0+2.0? " + (3.0+2.0));
        //Prints -2.0
        System.out.println("What is 5.0-7.0? " + (5.0-7.0));
        //Prints a statement
        System.out.println("Oh, that's why it's false.");
        //Prints a statement
        System.out.println("How about some more.");
        //Prints true because 5.0 is greater than -2.0
        System.out.println("Is it greater? " + (5.0 > -2.0));
        //Prints true because 5.0 is greater than or equal to -2.0
        System.out.println("Is it greater or equal? " + (5.0 >= -2.0));
        //Prints false because 5.0 is not less than or equal to -2
        System.out.println("Is it less or equal? " + (5.0 <= -2.0));
        //A floating point number has a decimal point which can be placed at any position in a number, relative to the number's significant digits
    }
}
