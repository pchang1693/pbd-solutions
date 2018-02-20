import java.util.Scanner;

public class NameAgeAndSalary {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String name;
        int age;
        double salary;
        
        System.out.println("Hello, what is your name?");
        name = sc.nextLine();
        
        System.out.println("\nHi, " + name + "! How old are you?");
        age = sc.nextInt();
        
        System.out.println("\nSo you're " + age + ", eh? That's not old at all!");
        System.out.println("How much do you make, " + name + "?");
        salary = sc.nextDouble();
        
        System.out.println("\n" + salary + "! I hope that's per hour and not per year!");
        
    }
}
