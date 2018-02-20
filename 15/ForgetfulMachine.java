import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Give me a word!");
        sc.nextLine();
        
        System.out.println("Give me a second word!");
        sc.nextLine();
        
        System.out.println("\nGreat, now your favourite number?");
        sc.nextInt();
        
        System.out.println("And your second favourite number...?");
        sc.nextInt();
        
        System.out.println("\nWhew! Wasn't that fun?");
        
    }
}
