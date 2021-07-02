//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/time-&-space/count-sort-official/ojquestion
package FoundationLevel.TimeAndSpace;
import java.io.*;
import java.util.*;

public class CountSort {

  public static void countSort(int[] arr) {
   //write your code here
   int max=Integer.MIN_VALUE;
   int min=Integer.MAX_VALUE;
   
   for(int i=0;i<arr.length;i++){
       if(arr[i]>max){
           max=arr[i];
       }
       if(arr[i]<min){
           min=arr[i];
       }
   }
   
//   System.out.println(min);
//   System.out.println(max);
   
   int freqLength=max-min+1;
   
   int freqArr[]=new int[freqLength];
   
   for(int i=0;i<arr.length;i++){
       int index=arr[i]-min;
       freqArr[index]++;
   }
//   System.out.println(Arrays.toString(freqArr));
   int prefixSumArray[]=new int[freqLength];
   prefixSumArray[0]= freqArr[0];
   for(int i=1;i<prefixSumArray.length;i++){
       prefixSumArray[i]=freqArr[i]+prefixSumArray[i-1];
   }
   
//   System.out.println(Arrays.toString(prefixSumArray));
   int result[]=new int[arr.length];
   for(int i=arr.length-1;i>=0;i--){
       int indexOfFreq=arr[i]-min;
       int index=prefixSumArray[indexOfFreq]-1;
       result[index]=arr[i];
       prefixSumArray[indexOfFreq]--;
       
   }
   
//   System.out.println(Arrays.toString(result));
   
   for(int i=0;i<arr.length;i++){
       arr[i]=result[i];
   }
   
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr);
    print(arr);
  }

}
