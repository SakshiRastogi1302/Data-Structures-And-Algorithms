//Question Link :- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/recursion-with-arraylist/get-kpc-official/ojquestion
package Recursion.Recursion_With_ArrayLists;

import java.io.*;
import java.util.*;

public class GetKPC {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<String> result=getKPC(s);
        System.out.println(result);
     }

    static String keypad[] = {
        ".;",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tu",
        "vwx",
        "yz"
    };

    public static ArrayList<String> getKPC(String str) {
        if(str.length()==0){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        
        char ch=str.charAt(0);
        String ros=str.substring(1);
        int index=Integer.parseInt(ch+"");
        String word=keypad[index];
        ArrayList<String> result=getKPC(ros);
        ArrayList<String> myList=new ArrayList<>();
        
        for(int i=0;i<word.length();i++){
            for(String val:result){
                myList.add(word.charAt(i)+val);
            }
        }
        
        
        return myList;
    }

}