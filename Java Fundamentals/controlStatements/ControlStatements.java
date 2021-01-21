package controlStatements;

/**
 *
 * @author Sadusha
 */
public class ControlStatements {

    public void ifDemo() {
        int i = 10;

        if (i > 15) {
            System.out.println("10 is less than 15");
        }

        // This statement will be executed 
        // as if considers one statement by default 
        System.out.println("I am Not in if");
    }

    public void ifElseDemo() {
        int i = 10;

        if (i < 15) {
            System.out.println("i is smaller than 15");
        } else {
            System.out.println("i is greater than 15");
        }
    }

    public void nestedIfDemo() {
        int i = 10;

        if (i == 10) {
            // First if statement 
            if (i < 15) {
                System.out.println("i is smaller than 15");
            }

            // Nested - if statement 
            // Will only be executed if statement above 
            // it is true 
            if (i < 12) {
                System.out.println("i is smaller than 12 too");
            } else {
                System.out.println("i is greater than 15");
            }
        }
    }

    public void ifElseIfDemo() {
        int i = 20;

        if (i == 10) {
            System.out.println("i is 10");
        } else if (i == 15) {
            System.out.println("i is 15");
        } else if (i == 20) {
            System.out.println("i is 20");
        } else {
            System.out.println("i is not present");
        }
    }

    public void switchCaseDemo() {
        int i = 9;
        switch (i) {
            case 0:
                System.out.println("i is zero.");
                break;
            case 1:
                System.out.println("i is one.");
                break;
            case 2:
                System.out.println("i is two.");
                break;
            default:
                System.out.println("i is greater than 2.");
        }
    }

    public void breakLoopDemo() {
        // Initially loop is set to run from 0-9 
        for (int i = 0; i < 10; i++) {
            // terminate loop when i is 5. 
            if (i == 5) {
                break;
            }

            System.out.println("i: " + i);
        }
        System.out.println("Loop complete.");
    }

    public void continueDemo() {
        for (int i = 0; i < 10; i++) {
            // If the number is even 
            // skip and continue 
            if (i % 2 == 0) {
                continue;
            }

            // If number is odd, print it 
            System.out.print(i + " ");
        }
    }

    public void returnDemo() {
        boolean t = true;
        System.out.println("Before the return.");

        if (t) {
            return;
        }

        // Compiler will bypass every statement  
        // after return 
        System.out.println("This won't execute.");
    }

    public static void main(String[] args) {
        ControlStatements controlStatements = new ControlStatements();
        controlStatements.ifDemo();
        controlStatements.ifElseDemo();
        controlStatements.ifElseIfDemo();
        controlStatements.switchCaseDemo();
        controlStatements.breakLoopDemo();
        controlStatements.continueDemo();
        controlStatements.returnDemo();
    }
}
/*
run:
I am Not in if
i is smaller than 15
i is 20
i is greater than 2.
i: 0
i: 1
i: 2
i: 3
i: 4
Loop complete.
1 3 5 7 9 Before the return.
*/