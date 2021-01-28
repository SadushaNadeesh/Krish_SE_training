package controlStatements;

public class DoWhileDemo {
    public static void main(String args[]) {

        // initialisation expression
        int i = 1;
        do {

            // Print the statement
            System.out.println("Hello World "+i);

            // update expression
            i++;
        }
        // test expression
        while (i < 6); //i value is 6 when loop break

        System.out.println("post increment : "+i++); //value is 6
        //now value is 7
        System.out.println("pre increment : "+ ++i); //value is 8
    }
}