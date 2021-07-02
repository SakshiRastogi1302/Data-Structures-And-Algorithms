//Question Link:- https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-subsequence-official/ojquestion
package FoundationLevel.Recursion.Recursion_On_The_Way_Up;
import java.util.*;

public class PrintSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        printSS(s,"");
    }

    public static void printSS(String str, String ans) {
        
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        
        printSS(ros,ans+ch);
        printSS(ros,ans);
        
        
    }

}