// Question Link:- https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/span-of-array-official/ojquestion
package FoundationLevel.Arrays;

import java.util.*;

public class SpanOfArray{

public static void main(String[] args) throws Exception {
    // Write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    
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
    
    System.out.println(max-min);
    
 }

}