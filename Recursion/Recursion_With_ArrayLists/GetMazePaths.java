//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/recursion-with-arraylist/get-maze-paths-official/ojquestion 
package Recursion.Recursion_With_ArrayLists;

import java.io.*;
import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();
        
        ArrayList<String> a=getMazePaths(0,0,rows-1,columns-1);
        System.out.println(a);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr>dr || sc>dc){
            ArrayList<String> base=new ArrayList<String>();
            return base;
        }
        if(sr==dr && sc==dc){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
            return base;
        }
        
        ArrayList<String> hpath=getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> vpath=getMazePaths(sr+1,sc,dr,dc);
        
        ArrayList<String> myList=new ArrayList<>();
        
        for(String h:hpath){
            myList.add("h"+h);
        }
        
        for(String v:vpath){
            myList.add("v"+v);
        }
        
        
        return myList;
    }

}