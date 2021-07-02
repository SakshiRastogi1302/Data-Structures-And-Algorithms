//Question Link :- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/recursion-in-arrays/last-index-official/ojquestion
package Recursion.Recursion_In_Arrays;

import java.io.*;
import java.util.*;

public class LastIndexOfAnArray {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        
        int x=sc.nextInt();
        int index=lastIndex(arr,0,x);
        System.out.println(index);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length){
            return -1;
        }
        
        int index=lastIndex(arr,idx+1,x);
        if(arr[idx]==x && index==-1){
            
            index=idx;
        }
        return index;
    }

}