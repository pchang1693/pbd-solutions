import java.util.Scanner;
public class SpaceBoxing {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        double weight;
        int planet;
        
        System.out.print("What is your earth weight? ");
        weight = sc.nextDouble();
        
        System.out.println("I have information on the following planets:");
        System.out.println("1. Venus \t2. Mars \t3. Jupiter");
        System.out.println("4. Saturn \t5. Uranus \t6. Neptune");
        
        System.out.print("\nWhat planet do you want to travel to? ");
        planet = sc.nextInt();
        
        
        if (planet == 1) {
            weight = weight * 0.78;
        }
        else if (planet == 2) {
            weight = weight * 0.39;
        }
        else if (planet == 3) {
            weight = weight * 2.65;
        }
        else if (planet == 4) {
            weight = weight * 1.17;
        }
        else if (planet == 5) {
            weight = weight * 1.05;
        }
        else if (planet == 6) {
            weight = weight * 1.23;
        }
        
        System.out.println("Your weight would be " + weight + " pounds on that planet.");
        
        
    }
}
