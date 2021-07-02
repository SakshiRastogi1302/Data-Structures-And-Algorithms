package FoundationLevel.Dynamic_Programming.Climbing_Stairs;
import java.util.*;
public class ClimbingStairs_Recursion {

    public static int climbStairsRecursion(int n){
        if(n<0){
            return 0;
        }
        else if(n==0){
            return 1;
        }

        int count1=climbStairsRecursion(n-1);
        int count2=climbStairsRecursion(n-2);
        int count3=climbStairsRecursion(n-3);

        return count1+count2+count3;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int noOfWays=climbStairsRecursion(n);
        System.out.println(noOfWays);
    }
}
