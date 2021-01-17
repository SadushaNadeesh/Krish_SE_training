package BigDecimalExample;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Sadusha
 */
public class BigDecimalExample {

    public static void main(String[] args) {
        BigDecimal bd1,bd2,bd3;

        double a = 4321.1234;
        double b = 7890.0987;
        double c = a + b;
        double d = a - b;
        System.out.println("Byte addition = "+c);
        System.out.println("Byte tion with floating point error = "+d);

        // Create two new BigDecimals
        bd1 = new BigDecimal("4321.1234");
        bd2 = new BigDecimal("7890.0987");

        // Addition of two BigDecimals
        bd3 = bd1.add(bd2);
        System.out.println("\nAddition = " + bd3);

        // Multiplication of two BigDecimals
        bd3 = bd1.multiply(bd2);
        System.out.println("Multiply = " + bd3);

        // Subtraction of two BigDecimals
        bd3 = bd1.subtract(bd2);
        System.out.println("Subtract = " + bd3);

        // Division of two BigDecimals
        //bd3 = bd1.divide(bd2);   //java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.
        bd3 = bd1.divide(bd2,2, RoundingMode.HALF_UP); //where 2 is the scale and RoundingMode.HALF_UP is rounding mode
        System.out.println("Divide = " + bd3);

        // BigDecima1 raised to the power of 2
        bd3 = bd1.pow(2);
        System.out.println("Power = " + bd3);

        // Negate value of BigDecimal1
        bd3 = bd1.negate();
        System.out.println("Negative = " + bd3);
    }
}
/*
Output:
Byte addition = 12211.222099999999
Byte tion with floating point error = -3568.975299999999

Addition = 12211.2221
Multiply = 34094090.12087958
Subtract = -3568.9753
Divide = 0.55
Power = 18672107.43802756
Negative = -4321.1234
*/