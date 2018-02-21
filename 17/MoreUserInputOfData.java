import java.util.Scanner;

public class MoreUserInputOfData {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String firstName;
        String lastName;
        int grade;
        int studentID;
        String login;
        double GPA;
        
        System.out.println("Please enter the following information so I can sell it for a profit!");
        System.out.println();
        
        System.out.print("First name: ");
        firstName = sc.next();
        
        System.out.print("Last name : ");
        lastName = sc.next();
        
        System.out.print("Grade (9-12): ");
        grade = sc.nextInt();
        
        System.out.print("Student ID: ");
        studentID = sc.nextInt();
        
        System.out.print("Login: ");
        login = sc.next();
        
        System.out.print("GPA (0.0-4.0): ");
        GPA = sc.nextDouble();
        
        System.out.println("\nYour information:");
        System.out.println("          Login: " + login);
        System.out.println("          ID:    " + studentID);
        System.out.println("          Name:  " + lastName + ", " + firstName);
        System.out.println("          GPA:   " + GPA);
        System.out.println("          Grade: " + grade);
        
    }
}
