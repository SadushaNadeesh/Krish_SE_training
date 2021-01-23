package abstractClasses;

/**
 *
 * @author Sadusha
 */
// An abstract class with a final method 
abstract class FinalAbstract { 
    final void fun() { System.out.println("Derived fun() called"); } 
} 
   
class Child extends FinalAbstract {} 

public class AbstractFinalDemo {
    public static void main(String[] args) {
        FinalAbstract child = new Child();
        child.fun();
    }
}
/*
Derived fun() called
*/