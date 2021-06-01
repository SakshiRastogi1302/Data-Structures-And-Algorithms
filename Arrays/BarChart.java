//Question Link:- https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/bar-chart-official/ojquestion
package Arrays;

import java.util.*;

public class BarChart{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    for(int j=max;j>=1;j--){
        for(int k=0;k<arr.length;k++){
            if(arr[k]>=j){
                System.out.print("*\t");
            }
            else{
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

}