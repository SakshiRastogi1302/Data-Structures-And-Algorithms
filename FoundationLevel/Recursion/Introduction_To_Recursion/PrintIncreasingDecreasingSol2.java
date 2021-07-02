//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/introduction-to-recursion/print-increasing-decreasing-official/ojquestion
package FoundationLevel.Recursion.Introduction_To_Recursion;

import java.util.*;

public class PrintIncreasingDecreasingSol2 {

    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
    
    public static void printIncreasing(int n){
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pdi(n);
    }
    
    public static void pdi(int n){
        printDecreasing(n);
        printIncreasing(n);
    }

}