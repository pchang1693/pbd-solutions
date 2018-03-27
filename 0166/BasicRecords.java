import java.util.Scanner;

class Student {
    String name;
    int grade;
    double average;
}

public class BasicRecords {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Student a = new Student();
        System.out.print("Enter the first student's name: ");
        a.name = sc.next();
        System.out.print("Enter the first student's grade: ");
        a.grade = sc.nextInt();
        System.out.print("Enter the first student's average: ");
        a.average = sc.nextDouble();
        
        Student b = new Student();
        System.out.print("\nEnter the second student's name: ");
        b.name = sc.next();
        System.out.print("Enter the second student's grade: ");
        b.grade = sc.nextInt();
        System.out.print("Enter the second student's average: ");
        b.average = sc.nextDouble();
        
        Student c = new Student();
        System.out.print("\nEnter the third student's name: ");
        c.name = sc.next();
        System.out.print("Enter the third student's grade: ");
        c.grade = sc.nextInt();
        System.out.print("Enter the third student's average: ");
        c.average = sc.nextDouble();
        
        System.out.println("\nThe names are: " + a.name + " " + b.name + " " + c.name);
        System.out.println("The grades are: " + a.grade + " " + b.grade + " " + c.grade);
        System.out.println("The averages are: " + a.average + " " + b.average + " " + c.average);
        
        System.out.println("\nThe average for the three students is: " + (a.average + b.average + c.average)/3);

    }
}
