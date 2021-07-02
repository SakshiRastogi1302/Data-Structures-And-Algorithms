package FoundationLevel.Dynamic_Programming.Fibonacci_DP;

import java.util.*;
public class Fibonacci_Memoization {

    public static int fibonacciMemoization(int n,int dp[]){
        if(n==0){
           return dp[0]=0;
        }
        else if(n==1){
            return dp[1]=1;
        }

        if(dp[n]!=0){
            return dp[n];
        }

        int fibNm1=fibonacciMemoization(n-1, dp);
        int fibNm2=fibonacciMemoization(n-2, dp);
        int fibN=fibNm1+fibNm2;

        return dp[n]=fibN;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[]=new int[n+1];
        long startTime = System.currentTimeMillis();
        int result = fibonacciMemoization(n,dp);
        long endTime = System.currentTimeMillis();
        System.out.println(result);
        long time=endTime-startTime;
        System.out.println(time);
    }
}
