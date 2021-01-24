package algorithms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sadusha
 */
public class Fibonacci {
    //    0, 1, 1, 2, 3, 5, 8, 13, 21, ...

    static int pointer = 1;

    public static void main(String[] args) {
        int n = 11, fnum = 0, secnum = 1;
        System.out.println("Fibonacci Series of " + n + " numbers");
        fibbonacciRec(n, fnum, secnum);
        //fibbonacciLoop(n, fnum, secnum);
    }

    //Method 1 ( Using recursion ) 
    public static void fibbonacciRec(int n, int fnum, int secnum) { //recursion

        if (pointer <= n) {
            System.out.println("Index no " + pointer + " Value = " + fnum);
            pointer++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            int sum = fnum + secnum;
            fnum = secnum;
            secnum = sum;
            fibbonacciRec(n, fnum, secnum);
        } else {
            return;
        }
    }

    //Method 2 ( Using Dynamic Programming ) 
    public static void fibbonacciLoop(int n, int fnum, int secnum) {

        for (int i = fnum; i < n; i++) {
            System.out.println("Index no " + (i + 1) + " Value = " + fnum);
            int sum = fnum + secnum;
            fnum = secnum;
            secnum = sum;

        }
    }
}
/*
Fibonacci Series of 11 numbers
Index no 1 Value = 0
Index no 2 Value = 1
Index no 3 Value = 1
Index no 4 Value = 2
Index no 5 Value = 3
Index no 6 Value = 5
Index no 7 Value = 8
Index no 8 Value = 13
Index no 9 Value = 21
Index no 10 Value = 34
Index no 11 Value = 55
*/