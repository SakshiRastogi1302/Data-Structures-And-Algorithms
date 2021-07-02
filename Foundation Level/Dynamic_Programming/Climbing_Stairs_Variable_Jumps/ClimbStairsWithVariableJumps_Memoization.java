
package Dynamic_Programming.Climbing_Stairs_Variable_Jumps;

import java.util.*;
public class ClimbStairsWithVariableJumps_Memoization {
    public static int climbStairsWithVariableJumps_Memoization(int moves[],int qb[],int n,int idx){
            if(idx==n){
                return qb[idx]=1;
            }
            
            if(qb[idx]!=0){
                return qb[idx];
            }
            int val=climbStairsWithVariableJumps_Memoization(moves,qb,n,idx+1);
            int result=0;
            for(int i=1;i<=moves[idx] && idx+i<=n;i++){
                result+=qb[idx+i];
            }
            
            return qb[idx]=result;
            
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int moves[]=new int[n];
        for(int i=0;i<n;i++){
            moves[i]=sc.nextInt();
        }
        int qb[]=new int[n+1];
        int noOfWays=climbStairsWithVariableJumps_Memoization(moves,qb,n,0);
        System.out.println(noOfWays);
    }
}
