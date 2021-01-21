package assignmentOperator;

/**
 *
 * @author Sadusha
 */
public class AssignmentOperator {

    public static void main(String[] args) {
        // Declaring variables 
        int num1 = 20, num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Subtracting & Assigning values 
        num1 -= num2; 
        // Displaying the assigned values 
        System.out.println("num1 = " + num1); 
        
        // Multiplying & Assigning values 
        num1 *= num2;
        // Displaying the assigned values 
        System.out.println("num1 = " + num1);
        
        // Dividing & Assigning values 
        num1 /= num2; 
        // Displaying the assigned values 
        System.out.println("num1 = " + num1); 
        
        // Moduling & Assigning values 
        num1 %= num2; 
        // Displaying the assigned values 
        System.out.println("num1 = " + num1); 
        
        
    }
}