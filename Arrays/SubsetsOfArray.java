//Question Link :- https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/subsets-of-array-official/ojquestion

package Arrays;

import java.util.*;

public class SubsetsOfArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    int limit=(int)Math.pow(2,n);
    for(int i=0;i<limit;i++){
        int temp=i;
        String s="";
        for(int j=arr.length-1;j>=0;j--){
            int rem=temp%2;
            temp=temp/2;
            
            if(rem==0){
                s="-\t"+s;
            }
            else{
                s=arr[j]+"\t"+s;
            }
        }
        System.out.println(s);
    }
 }

}