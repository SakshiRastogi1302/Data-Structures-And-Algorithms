//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/recursion-with-arraylist/get-stair-paths-official/ojquestion
package Recursion.Recursion_With_ArrayLists;


import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> result=getStairPaths(n);
        System.out.println(result);
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n<0){
            ArrayList<String> a=new ArrayList<>();
            return a;
        }
        
        if(n==0){
            ArrayList<String> a=new ArrayList<>();
            a.add("");
            return a;
        }
        
        ArrayList<String> One = getStairPaths(n-1);
        ArrayList<String> Two = getStairPaths(n-2);
        ArrayList<String> Three = getStairPaths(n-3);
        
        ArrayList<String> myList=new ArrayList<>();
        for(String s1:One){
            myList.add(1+s1);
        }
        
        for(String s2:Two){
            myList.add(2+s2);
        }
        
        for(String s3:Three){
            myList.add(3+s3);
        }
        
        return myList;
    }

}