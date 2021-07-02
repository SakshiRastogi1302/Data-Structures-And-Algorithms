package FoundationLevel.Dynamic_Programming.Fibonacci_DP;

import java.util.*;

public class Fibonacci_Tabulation {
    public static int fibonacciTabulation(int n){
        int dp[]=new int[n+1];

        for(int i=0;i<=n;i++){
            if(i==0){
                dp[0]=0;
            }
            else if(i==1){
                dp[1]=1;
            }
            else{
                dp[i]=dp[i-1]+dp[i-2];
            }
        }

        return dp[n];
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long startTime = System.currentTimeMillis();
        int result = fibonacciTabulation(n);
        long endTime = System.currentTimeMillis();
        System.out.println(result);
        long time=endTime-startTime;
        System.out.println(time);
    }
}
