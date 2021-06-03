//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/introduction-to-recursion/print-zig-zag-official/ojquestion
package Recursion.Intrduction_To_Recursion;

import java.util.*;

public class PrintZigZag {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        pzz(n);
    }

    public static void pzz(int n){
        
        if(n==0){
            return;
        }
        
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
        pzz(n-1);
        System.out.print(n+" ");
    }

}