//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/introduction-to-recursion/power-logarithmic-official/ojquestion
package Recursion.Introduction_To_Recursion;

import java.util.*;

public class powerLogarithmic {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n =sc.nextInt();
        int powerResult=power(x,n);
        System.out.println(powerResult);
    }

    public static int power(int x, int n){
        if(n==1){
            return x;
        }
        
        int powerResult=power(x,n/2);
        int powerResult_n=powerResult*powerResult;
        if(n%2==1){
            powerResult_n=powerResult_n*x;
        }
        
        return powerResult_n;
    }

}