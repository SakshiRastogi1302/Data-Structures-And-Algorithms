//Question Link:- https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-kpc-official/ojquestion
package FoundationLevel.Recursion.Recursion_On_The_Way_Up;
import java.util.*;

public class PrintKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        printKPC(s,"");
    }

    static String[]code ={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        char ch=str.charAt(0);
        String ros=str.substring(1);
        
        String charCode=code[ch-'0'];
        for(int i=0;i<charCode.length();i++){
            char c=charCode.charAt(i);
            printKPC(ros,asf+c);
        }
        
        
    }

}