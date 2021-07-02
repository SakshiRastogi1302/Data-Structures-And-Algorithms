//Question Link:- https://www.pepcoding.com/resources/online-java-foundation/string,-string-builder-and-arraylist/string-with-difference-of-every-two-consecutive-characters-official/ojquestion
package Strings;

import java.util.*;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {

	public static String solution(String str){
		// write your code here
		StringBuilder sb=new StringBuilder();
		sb.append(str.charAt(0));
		
		for(int i=1;i<str.length();i++){
		    int diff=str.charAt(i)-str.charAt(i-1);
		    sb.append(diff);
		    sb.append(str.charAt(i));
		}

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}