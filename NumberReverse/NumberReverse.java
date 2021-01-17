import java.util.Scanner;


public class NumberReverse {

    public static void main(String[] args) {

        int number, reverseNumber = 0;

        System.out.print("Enter the number to be reversed without any 0s : ");
        
        //Get user input via scanner class
        Scanner scanner = new Scanner(System.in);

        //number = Integer.parseInt(scanner.nextLine());
        number = scanner.nextInt();

		//Iterate the inserted number.

        while (number != 0) {
            reverseNumber = reverseNumber * 10;
            reverseNumber = reverseNumber + number % 10; //this returns the remained of the number when divided by 10.
            number = number / 10;
       	}

        System.out.println("The reversed no : "+reverseNumber);

    }
}