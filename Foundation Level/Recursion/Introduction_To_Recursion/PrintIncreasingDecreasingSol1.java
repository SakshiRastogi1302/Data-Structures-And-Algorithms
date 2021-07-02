//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/introduction-to-recursion/print-increasing-decreasing-official/ojquestion
package Recursion.Introduction_To_Recursion;

import java.util.*;

public class PrintIncreasingDecreasingSol1 {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pdi(n);
    }

    public static void pdi(int n){
        if(n==0){
            return;
        }
        
        System.out.println(n);
        pdi(n-1);
        System.out.println(n);
    }

}