import java.util.Scanner;

class Student {
    String name;
    int grade;
    double average;
}

public class LittleDatabaseWithLoop {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String names = "";
        String grades = "";
        String averages = "";
        double total = 0;
        
        Student[] arr = new Student[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student();
            System.out.print("Enter student " + (i+1) + "'s name: ");
            arr[i].name = sc.next();
            names += arr[i].name + " ";
            
            System.out.print("Enter student " + (i+1) + "'s grade: ");
            arr[i].grade = sc.nextInt();
            grades += arr[i].grade + " ";
            
            System.out.print("Enter student " + (i+1) + "'s average: ");
            arr[i].average = sc.nextDouble();
            averages += arr[i].average + " ";
            total += arr[i].average;
            
            System.out.println();
        }
        
        
        System.out.println("The names are: " + names);
        System.out.println("The grades are: " + grades);
        System.out.println("The averages are: " + averages);
        
        System.out.println("\nThe average for the three students is: " + total/3);

        
    }
}
