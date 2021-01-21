package bitwiseOperators;

/**
 *
 * @author Sadusha
 */
public class BitwiseOperators {
    public static void main(String[] args) {
         //Initial values 
        int a = 5; 
        int b = 7; 
  
        // bitwise and 
        // 0101 & 0111=0101 = 5 
        System.out.println("a&b = " + (a & b)); 
  
        // bitwise or 
        // 0101 | 0111=0111 = 7 
        System.out.println("a|b = " + (a | b)); 
  
        // bitwise xor 
        // 0101 ^ 0111=0010 = 2 
        System.out.println("a^b = " + (a ^ b)); 
  
        // bitwise and 
        // ~0101=1010 
        // will give 2's complement of 1010 = -6 
        System.out.println("~a = " + ~a); 
  
        // can also be combined with 
        // assignment operator to provide shorthand 
        // assignment 
        // a=a&b 
        a &= b; 
        System.out.println("a= " + a); 
        
        int c = 5; 
        int d = -10; 
  
        // left shift operator 
        // 0000 0101<<2 =0001 0100(20) 
        // similar to 5*(2^2) 
        System.out.println("c<<2 = " + (c << 2)); 
  
        // right shift operator 
        // 0000 0101 >> 2 =0000 0001(1) 
        // similar to 5/(2^2) 
        System.out.println("d>>2 = " + (d >> 2)); 
  
        // unsigned right shift operator 
        System.out.println("d>>>2 = " + (d >>> 2)); 
    }
}
/*
a&b = 5
a|b = 7
a^b = 2
~a = -6
a= 5
c<<2 = 20
d>>2 = -3
d>>>2 = 1073741821
*/