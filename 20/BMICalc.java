import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double feet, inches, height, pounds, weight, BMI;
        
        System.out.print("Your height (feet only): ");
        feet = sc.nextDouble();
        
        System.out.print("Your height (inches): ");
        inches = sc.nextDouble();
        
        height = (feet * 12 + inches) * 0.0254;
        
        System.out.print("Your weight in pounds: ");
        pounds = sc.nextDouble();
        
        weight = pounds * 0.453592;
        
        BMI = weight / Math.pow(height, 2);
        
        System.out.println("\nYour BMI is " + BMI);
        
    }
}
