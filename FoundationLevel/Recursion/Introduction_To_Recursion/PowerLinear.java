//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/introduction-to-recursion/power-linear-official/ojquestion
package FoundationLevel.Recursion.Introduction_To_Recursion;

import java.util.*;

public class PowerLinear {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        int powerResult=power(x,n);
        System.out.println(powerResult);
        
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        
        int powerResult=power(x,n-1);
        powerResult=powerResult*x;
        return powerResult;
    }

}