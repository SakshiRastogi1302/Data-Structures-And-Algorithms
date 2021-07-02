//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/introduction-to-recursion/factorial-official/ojquestion
package FoundationLevel.Recursion.Introduction_To_Recursion;

import java.util.*;

public class Factorial {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println(fact);
    }

    public static int factorial(int n){
        
        if(n==0){
            return 1;
        }
        
        int fact=factorial(n-1);
        fact=fact*n;
        return fact;
    }

}
