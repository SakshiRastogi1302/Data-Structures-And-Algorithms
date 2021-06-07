//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/recursion-with-arraylist/get-maze-path-with-jumps-official/ojquestion
package Recursion.Recursion_With_ArrayLists;

import java.io.*;
import java.util.*;

public class GetMazePathWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        ArrayList<String> result=getMazePaths(1,1,r,c);
        System.out.println(result);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myList=new ArrayList<>();
        for(int j=1;j<=dc-sc;j++){
            ArrayList<String> result= getMazePaths(sr,sc+j,dr,dc);
            for(String s:result){
                myList.add("h"+j+s);
            }
        }
        
        for(int j=1;j<=dr-sr;j++){
            ArrayList<String> result= getMazePaths(sr+j,sc,dr,dc);
            for(String s:result){
                myList.add("v"+j+s);
            }
        }
        
        for(int j=1;j<=dr-sr && j<=dc-sc;j++){
            ArrayList<String> result= getMazePaths(sr+j,sc+j,dr,dc);
            for(String s:result){
                myList.add("d"+j+s);
            }
        }
        
        return myList;
    }

}