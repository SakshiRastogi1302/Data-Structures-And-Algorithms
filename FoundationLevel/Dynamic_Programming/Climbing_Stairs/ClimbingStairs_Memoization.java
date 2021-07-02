package FoundationLevel.Dynamic_Programming.Climbing_Stairs;
import java.util.*;
public class ClimbingStairs_Memoization {

    public static int climbStairsMemoization(int n,int dp[]){
        if(n==0){
            return dp[0]=1;
        }
        else if(n==1){
            return dp[1]=1;
        }
        else if(n==2){
            return dp[2]=2;
        }

        if(dp[n]!=0){
            return dp[n];
        }
        
        int count1=climbStairsMemoization(n-1,dp);
        int count2=climbStairsMemoization(n-2,dp);
        int count3=climbStairsMemoization(n-3,dp);

        int totalWays=count1+count2+count3;
        return dp[n]=totalWays;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        int noOfWays=climbStairsMemoization(n,dp);
        System.out.println(noOfWays);
    }   
}
