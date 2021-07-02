//Question Link:- https://www.pepcoding.com/resources/online-java-foundation/recursion-on-the-way-up/print-maze-path-with-jumps-official/ojquestion
package FoundationLevel.Recursion.Recursion_On_The_Way_Up;
import java.util.*;

public class PrintMazePathsWithJumps {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        printMazePaths(0,0,n-1,m-1,"");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        
        
        for(int hm=1;hm<=dc-sc;hm++){
            printMazePaths(sr,sc+hm,dr,dc,psf+"h"+hm);
        }
        
        for(int vm=1;vm<=dr-sr;vm++){
            printMazePaths(sr+vm,sc,dr,dc,psf+"v"+vm);
        }
        
        for(int dm=1;dm<=dc-sc && dm<=dr-sr;dm++){
            printMazePaths(sr+dm,sc+dm,dr,dc,psf+"d"+dm);
        }
    }

}