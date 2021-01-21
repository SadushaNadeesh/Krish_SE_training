package logicalOperator;

/**
 *
 * @author Sadusha
 */
public class LogicalOperator {

    public void LogicalAND() {
        // initializing variables 
        int a = 10, b = 20, c = 20, d = 0;

        // Displaying a, b, c 
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);

        // using logical AND to verify 
        // two constraints 
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        } else {
            System.out.println("False conditions");
        }
    }

    public void LogicalOR() {
        // initializing variables 
        int a = 10, b = 1, c = 10, d = 30;

        // Displaying a, b, c 
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
        System.out.println("Var4 = " + d);

        // using logical OR to verify 
        // two constraints 
        if (a > b || c == d) {
            System.out.println("One or both"
                    + " the conditions are true");
        } else {
            System.out.println("Both the"
                    + " conditions are false");
        }
    }
    
    public void LogicalNOT(){
         // initializing variables 
        int a = 10, b = 1; 
  
        // Displaying a, b, c 
        System.out.println("Var1 = " + a); 
        System.out.println("Var2 = " + b); 
  
        // Using logical NOT operator 
        System.out.println("!(a < b) = " + !(a < b)); 
        System.out.println("!(a > b) = " + !(a > b)); 
    }

    public static void main(String[] args) {
        LogicalOperator logicalOperator = new LogicalOperator();
        logicalOperator.LogicalAND();
        logicalOperator.LogicalNOT();
        logicalOperator.LogicalOR();
    }
}

/*
Var1 = 10
Var2 = 20
Var3 = 20
The sum is: 50
Var1 = 10
Var2 = 1
!(a < b) = true
!(a > b) = false
Var1 = 10
Var2 = 1
Var3 = 10
Var4 = 30
One or both the conditions are true
*/