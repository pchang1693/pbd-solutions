public class ElseAndIf {
    public static void main(String[] args) {
        
        int people = 30;
        int cars = 40;
        int buses = 15;
        
        // else if is used for code that will be executed if the previous conditions were false but the else if condition is true
        // else is used for code that will be executed if none of the previous conditions were true
        if (cars > people) {
            System.out.println("We should take the cars.");
        }
        
        // Removing the "else" part of the else if statement makes the code in the else block run
        if (cars < people) {
            System.out.println("We should not take the cars.");
        } else {
            System.out.println("We can't decide.");
        }
        
        
        if (buses > cars) {
            System.out.println("That's too many buses.");
        } else if (buses < cars) {
            System.out.println("Maybe we could take the buses.");
        } else {
            System.out.println("We still can't decide.");
        }
        
        
        if (people > buses) {
            System.out.println("All right, let's just take the buses.");
        } else {
            System.out.println("Fine, let's stay home then.");
        }
        
    }
}
