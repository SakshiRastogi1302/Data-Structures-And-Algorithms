//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/introduction-to-recursion/print-decreasing-official/ojquestion
package Recursion.Intrduction_To_Recursion;

import java.util.*;

public class PrintDecreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        
        System.out.println(n);
        printDecreasing(n-1);
    }

}