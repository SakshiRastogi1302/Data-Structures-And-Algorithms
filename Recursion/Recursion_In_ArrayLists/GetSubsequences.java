//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/recursion-with-arraylist/get-subsequence-official/ojquestion
package Recursion.Recursion_In_ArrayLists;


import java.util.*;

public class GetSubsequences {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        ArrayList<String> al=gss(s);
        System.out.println(al);
    }

    public static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }
        
        char ch = str.charAt(0);
        String ros=str.substring(1);
        
        ArrayList<String> al=gss(ros);
        ArrayList<String> myList=new ArrayList<>();
        
        for(String s:al){
            myList.add(s);
        }
        for(String s:al){
            myList.add(ch+s);
        }
        
        return myList;
    }

}
