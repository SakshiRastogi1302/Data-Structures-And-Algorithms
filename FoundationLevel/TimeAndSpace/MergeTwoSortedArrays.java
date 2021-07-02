//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/time-&-space/merge-two-sorted-arrays-official/ojquestion
package FoundationLevel.TimeAndSpace;

import java.io.*;
import java.util.*;

public class MergeTwoSortedArrays {

  public static int[] mergeTwoSortedArrays(int[] a, int[] b){
    //write your code here
    int result[]=new int[a.length+b.length];
    int ap=0;
    int bp=0;
    int kp=0;
    
    while(ap<a.length && bp<b.length){
        if(a[ap]<b[bp]){
            result[kp]=a[ap];
            ap++;
        }
        else{
            result[kp]=b[bp];
            bp++;
        }
        
        kp++;
    }
    
    if(ap<a.length){
        while(ap<a.length){
            result[kp]=a[ap];
            ap++;
            kp++;
        }
    }
    else if(bp<b.length){
        while(bp<b.length){
            result[kp]=b[bp];
            bp++;
            kp++;
        }
    }
    return result;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}