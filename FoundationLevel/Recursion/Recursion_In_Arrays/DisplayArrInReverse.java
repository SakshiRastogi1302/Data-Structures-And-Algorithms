//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/recursion-in-arrays/display-array-in-reverse/ojquestion
package FoundationLevel.Recursion.Recursion_In_Arrays;

import java.io.*;
import java.util.*;

public class DisplayArrInReverse {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);  
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        displayArrReverse(arr,0);
    }

    public static void displayArrReverse(int[] arr, int idx) {
        
        if(idx==arr.length){
            return;
        }
        
        
        displayArrReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }

}