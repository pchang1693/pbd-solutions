import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int age;
		int feet;
		int inches;
		double weight;

		System.out.print("How old are you? ");
		age = sc.nextInt();

		System.out.print("How many feet tall are you? ");
		feet = sc.nextInt();

        System.out.print("And how many inches? ");
        inches = sc.nextInt();

		System.out.print("How much do you weigh? ");
		weight = sc.nextDouble();

		System.out.println("So you're " + age + " old, " + feet + "\'" + inches + "\" tall and " + weight + " heavy.");
        
    }
}
