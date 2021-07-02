//Question Link:-https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/difference-of-two-arrays-official/ojquestion

package FoundationLevel.Arrays;

import java.util.*;

public class DifferenceOfTwoArrays {


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
    
    int diffArray[]=new int[n2];
    
    int p1=n1-1;
    int p2=n2-1;
    int diffp=n2-1;
    int carry=0;
    
    while(diffp>=0){
        int num1=(p1>=0)?a1[p1]:0;
        int num2=(p2>=0)?a2[p2]:0;
        int diff;
        if(num2+carry>=num1){
            diff=num2+carry-num1;
            carry=0;
        }
        else{
            diff=num2+10+carry-num1;
            carry=-1;
        }
        
        diffArray[diffp]=diff;
        
        p1--;
        p2--;
        diffp--;
        
    }
    
    int index=0;
    for(int i=0;i<diffArray.length;i++){
        if(diffArray[i]==0){
            index++;
        }
        else{
            break;
        }
    }
    
    for(int j=index;j<diffArray.length;j++){
        System.out.println(diffArray[j]);
    }
 }

}
