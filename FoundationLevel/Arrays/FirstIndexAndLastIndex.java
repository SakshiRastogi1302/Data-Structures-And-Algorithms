//Question Link:- https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/first-index-last-index-official/ojquestion
package FoundationLevel.Arrays;

import java.util.*;

public class FirstIndexAndLastIndex{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    
    int d=sc.nextInt();
    
    int first_index=-1;
    
    int low=0;
    int high=arr.length-1;
    
    while(low<=high){
        int mid=(low+high)/2;
        
        if(arr[mid]==d){
            first_index=mid;
            high=mid-1;
        }
        else if(arr[mid]>d){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    
    int last_index=-1;
    
    low=0;
    high=arr.length-1;
    
    while(low<=high){
        int mid=(low+high)/2;
        
        if(arr[mid]==d){
            last_index=mid;
            low=mid+1;
        }
        else if(arr[mid]>d){
            high=mid-1;
        }
        else{
            low=mid+1;
        }
    }
    
    System.out.println(first_index);
    System.out.println(last_index);
 }

}