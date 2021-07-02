//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/time-&-space/sort-dates-official/ojquestion
package TimeAndSpace;

import java.io.*;
import java.util.*;

public class SortDates {

  public static void sortDates(String[] arr) {
    // write your code here
    countSort(arr,1000000,100,32);
    countSort(arr,10000,100,13);
    countSort(arr,1,10000,2501);
  }

  public static void countSort(String[] arr,int div, int mod, int range) {
    // write your code here
    int freqArr[]=new int[range];
   
   for(int i=0;i<arr.length;i++){
       int element=Integer.parseInt(arr[i],10)/div%mod;
       int index=element;
       freqArr[index]++;
   }
   int prefixSumArray[]=new int[range];
   prefixSumArray[0]= freqArr[0];
   for(int i=1;i<prefixSumArray.length;i++){
       prefixSumArray[i]=freqArr[i]+prefixSumArray[i-1];
   }
   
//   System.out.println(Arrays.toString(prefixSumArray));
   

   String result[]=new String[arr.length];
   for(int i=arr.length-1;i>=0;i--){
      int element=Integer.parseInt(arr[i],10)/div%mod;
      int indexOfFreq=element;
      int index=prefixSumArray[indexOfFreq];
      result[index-1]=arr[i];
      prefixSumArray[indexOfFreq]--;
       
   }
   

   for(int i=0;i<arr.length;i++){
       arr[i]=result[i];
   }
    
  }

  public static void print(String[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      String str = scn.next();
      arr[i] = str;
    }
    sortDates(arr);
    print(arr);
  }

}