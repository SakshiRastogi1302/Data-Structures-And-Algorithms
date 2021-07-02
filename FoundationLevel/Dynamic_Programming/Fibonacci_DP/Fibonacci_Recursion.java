package FoundationLevel.Dynamic_Programming.Fibonacci_DP;

import java.util.*;

public class Fibonacci_Recursion {
    /*  1. Fibonacci Sequence is starting from index 0 i.e. 0th Term = 0, 1st Term = 1, 2nd Term = 2 and so on. 
        2. There is a overlapping sub problem i.e. if you calculate fib(5), then fib(2) will be calculated 3 times
           instead of only 1 time which increases its time complexity
        3. If I calculate fib(80), it will take a lot of time to get the answer.
    */
    public static int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long startTime = System.currentTimeMillis();
        int result = fibonacciRecursion(n);
        long endTime = System.currentTimeMillis();
        System.out.println(result);
        long time=endTime-startTime;
        System.out.println(time);

    }

}
