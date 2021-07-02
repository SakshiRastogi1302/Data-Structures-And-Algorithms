//Question Link :- https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subarray-problem-official/ojquestion
package FoundationLevel.Arrays;

import java.util.*;

public class SubArrayProblem{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]+"\t");
            }
            System.out.println();
        }
    }
 }

}