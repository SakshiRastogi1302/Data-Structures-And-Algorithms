//Question Link :- https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/ceil-floor-official/ojquestion
package FoundationLevel.Arrays;

import java.util.*;

public class BrokenEconomy{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    
    int denomination=sc.nextInt();
    int ceil=Integer.MAX_VALUE;
    int floor=Integer.MIN_VALUE;
    
    int low=0;
    int high=arr.length-1;
    
    while(low<=high){
        int mid=(low+high)/2;
        
        if(arr[mid]==denomination){
            System.out.println(arr[mid]);
            return;
        }
        else if(arr[mid]>denomination){
            high=mid-1;
            ceil=arr[mid];
        }
        else{
            low=mid+1;
            floor=arr[mid];
        }
    }
    
    System.out.println(ceil);
    System.out.println(floor);
    
}

}