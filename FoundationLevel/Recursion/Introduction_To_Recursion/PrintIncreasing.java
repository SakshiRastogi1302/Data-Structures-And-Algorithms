//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/introduction-to-recursion/print-increasing-official/ojquestion
package FoundationLevel.Recursion.Introduction_To_Recursion;


import java.util.*;

public class PrintIncreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n){
        if(n==0){
            return;
        }
        
        printIncreasing(n-1);
        System.out.println(n);
    }

}