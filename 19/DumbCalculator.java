import java.util.Scanner;

public class DumbCalculator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double first, second, third;
        
        System.out.print("What is your first number? ");
        first = sc.nextDouble();
        
        System.out.print("What is your second number? ");
        second = sc.nextDouble();
        
        System.out.print("What is your third number? ");
        third = sc.nextDouble();
        
        System.out.println("\n(" + first + " + " + second + " + " + third + ") / 2 is..." + ((first + second + third) / 2));
        
    }
}
