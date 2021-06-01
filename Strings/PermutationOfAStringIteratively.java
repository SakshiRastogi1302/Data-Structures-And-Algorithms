// Question Link :- https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/print-all-permutations-of-a-string-iteratively-official/ojquestion
package Strings;

import java.util.*;

public class PermutationOfAStringIteratively {
    
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
         return fact;
    }

	public static void solution(String str){
		// write your code here
		int noOfPermutaions=factorial(str.length());
		for(int i=0;i<noOfPermutaions;i++){
		    int temp=i;
		    StringBuilder s=new StringBuilder(str);
		    StringBuilder sb=new StringBuilder();
		    for(int j=str.length();j>=1;j--){
		        int rem=temp%j;
		        sb.append(s.charAt(rem));
		        s.deleteCharAt(rem);
		        int q=temp/j;
		        temp=q;
		    }
		    
		    System.out.println(sb);
		}
		
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
