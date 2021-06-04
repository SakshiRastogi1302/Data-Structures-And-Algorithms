package Recursion.Recursion_In_Arrays;

import java.io.*;
import java.util.*;

public class MaxOfAnArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        int maxi=maxOfArray(arr,0);
        System.out.println(maxi);
    }

    public static int maxOfArray(int[] arr, int idx){
        
        if(idx==arr.length-1){
            return arr[idx];
        }
        
        int maxi=maxOfArray(arr,idx+1);
        if(maxi<arr[idx]){
            maxi=arr[idx];
        }
        
        return maxi;
    }

}
