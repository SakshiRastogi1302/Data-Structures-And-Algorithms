package FoundationLevel.Dynamic_Programming.Climbing_Stairs;

import java.util.*;
public class ClimbingStairs_Tabulation {
    public static int climbStairsTabulation(int n){
        int dp[]=new int[n+1];

        for(int i=0;i<=n;i++){
            if(i==0){
                dp[0]=1;
            }
            else if(i==1){
                dp[1]=1;
            }
            else if(i==2){
                dp[2]=2;
            }
            else{
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
            }
        }

        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int noOfWays=climbStairsTabulation(n);
        System.out.println(noOfWays);
    }
}
