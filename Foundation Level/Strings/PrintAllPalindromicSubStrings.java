//Question Link:- https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/print-all-palindromic-substrings-official/ojquestion
package Strings;

import java.util.*;

public class PrintAllPalindromicSubStrings {
    
    public static boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;
        
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            
            start++;
            end--;
        }
        
        return true;
    }

	public static void solution(String str){
		//write your code here
		for(int i=0;i<str.length();i++){
		    for(int j=i+1;j<=str.length();j++){
		        if(isPalindrome(str.substring(i,j))){
		            System.out.println(str.substring(i,j));
		        }
		    }
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}
