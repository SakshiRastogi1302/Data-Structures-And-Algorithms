package FoundationLevel.Dynamic_Programming.Climbing_Stairs_Variable_Jumps;

import java.util.*;
public class ClimbStairsWithVariableJumps_Recursion {
    public static int climbStairsVariableJumps_Recursion(int moves[],int n,int idx){
            if(idx==n){
                return 1;
            }
            
            int val=climbStairsVariableJumps_Recursion(moves,n,idx+1);
            int result=0;
            for(int i=1;i<=moves[idx] && idx+i<=n;i++){
                result+=climbStairsVariableJumps_Recursion(moves,n,idx+i);
            }
            
            return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int moves[]=new int[n];
        for(int i=0;i<n;i++){
            moves[i]=sc.nextInt();
        }
        int noOfWays=climbStairsVariableJumps_Recursion(moves,n,0);
        System.out.println(noOfWays);
    }
}
