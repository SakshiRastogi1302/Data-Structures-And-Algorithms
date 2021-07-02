//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/time-&-space/radix-sort-official/ojquestion
package FoundationLevel.TimeAndSpace;

import java.io.*;
import java.util.*;

public class RadixSort {

  public static void radixSort(int[] arr) {
    // write code here    
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    int exponent=1;
    while(exponent<=max){
        countSort(arr,exponent);
        exponent*=10;
    }
  }

  public static void countSort(int[] arr, int exponent) {
    // write code here

   int freqArr[]=new int[10];
   
   for(int i=0;i<arr.length;i++){
       int element=arr[i]/exponent%10;
       int index=element;
       freqArr[index]++;
   }
   int prefixSumArray[]=new int[10];
   prefixSumArray[0]= freqArr[0];
   for(int i=1;i<prefixSumArray.length;i++){
       prefixSumArray[i]=freqArr[i]+prefixSumArray[i-1];
   }
   
//   System.out.println(Arrays.toString(prefixSumArray));
   

   int result[]=new int[arr.length];
   for(int i=arr.length-1;i>=0;i--){
      int element=arr[i]/exponent%10;
      int indexOfFreq=element;
      int index=prefixSumArray[indexOfFreq];
      result[index-1]=arr[i];
      prefixSumArray[indexOfFreq]--;
       
   }
   

   for(int i=0;i<arr.length;i++){
       arr[i]=result[i];
   }
    System.out.print("After sorting on " + exponent + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}