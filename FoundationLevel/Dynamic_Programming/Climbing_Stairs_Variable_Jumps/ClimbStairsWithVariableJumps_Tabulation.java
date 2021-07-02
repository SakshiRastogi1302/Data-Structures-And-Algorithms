package FoundationLevel.Dynamic_Programming.Climbing_Stairs_Variable_Jumps;

import java.util.*;
public class ClimbStairsWithVariableJumps_Tabulation {
    public static int climbStairsWithVariableJumps_Tabulation(int n,int []moves){
        int qb[]=new int[n+1];
        
        for(int i=n;i>=0;i--){
            if(i==n){
                qb[i]=1;
            }
            
            else{
                int result=0;
                for(int j=1;j<=moves[i] && j+i<=n;j++){
                    result+=qb[i+j];
                }
                
                qb[i]=result;
            }
        }
        
        return qb[0];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int moves[]=new int[n];
        for(int i=0;i<n;i++){
            moves[i]=sc.nextInt();
        }
        int qb[]=new int[n+1];
        int noOfWays=climbStairsWithVariableJumps_Tabulation(n,moves);
        System.out.println(noOfWays);
    }
}
