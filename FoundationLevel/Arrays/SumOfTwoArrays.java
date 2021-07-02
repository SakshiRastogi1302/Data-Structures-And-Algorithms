//Question Link:- https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/sum-of-two-arrays-official/ojquestion
package FoundationLevel.Arrays;

import java.util.*;

public class SumOfTwoArrays{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int a1[]=new int[n1];
    for(int i=0;i<n1;i++){
        a1[i]=sc.nextInt();
    }
    
    int n2=sc.nextInt();
    int a2[]=new int[n2];
    for(int i=0;i<n2;i++){
        a2[i]=sc.nextInt();
    }
    
    int sumArray[]=new int[n1>n2?n1:n2];
    
    int p1=n1-1;
    int p2=n2-1;
    int sump=sumArray.length-1;
    int carry=0;
    while(sump>=0){
        int num1=(p1>=0)?a1[p1]:0;
        int num2=(p2>=0)?a2[p2]:0;
        
        int total=num1+num2+carry;
        sumArray[sump]=total%10;
        carry=total/10;
        
        p1--;
        p2--;
        sump--;
    }
    
    if(carry!=0){
        System.out.println(carry);
    }
    for(int i=0;i<sumArray.length;i++){
        System.out.println(sumArray[i]);
    }
    
 }

}