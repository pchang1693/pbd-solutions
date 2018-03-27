import java.util.Scanner;

class Student {
    String name;
    int grade;
    double average;
}

public class LittleDatabase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Student[] arr = new Student[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
        }
        
        System.out.print("Enter the first student's name: ");
        arr[0].name = sc.next();
        System.out.print("Enter the first student's grade: ");
        arr[0].grade = sc.nextInt();
        System.out.print("Enter the first student's average: ");
        arr[0].average = sc.nextDouble();
        
        System.out.print("\nEnter the second student's name: ");
        arr[1].name = sc.next();
        System.out.print("Enter the second student's grade: ");
        arr[1].grade = sc.nextInt();
        System.out.print("Enter the second student's average: ");
        arr[1].average = sc.nextDouble();
        
        System.out.print("\nEnter the third student's name: ");
        arr[2].name = sc.next();
        System.out.print("Enter the third student's grade: ");
        arr[2].grade = sc.nextInt();
        System.out.print("Enter the third student's average: ");
        arr[2].average = sc.nextDouble();
        
        System.out.println("\nThe names are: " + arr[0].name + " " + arr[1].name + " " + arr[2].name);
        System.out.println("The grades are: " + arr[0].grade + " " + arr[1].grade + " " + arr[2].grade);
        System.out.println("The averages are: " + arr[0].average + " " + arr[1].average + " " + arr[2].average);
        
        System.out.println("\nThe average for the three students is: " + (arr[0].average + arr[1].average + arr[2].average)/3);

        
    }
}
