//Question Link :- https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/toggle-case-official/ojquestion
package FoundationLevel.Strings;

import java.io.*;
import java.util.*;

public class ToggleCase {

	public static String toggleCase(String str){
		//write your code here
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++){
		    if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
		        char ch= (char)('a'+str.charAt(i)-'A');
		        sb.append(ch);
		    }
		    else{
		        char ch= (char)('A'+str.charAt(i)-'a');
		        sb.append(ch);
		    }
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}