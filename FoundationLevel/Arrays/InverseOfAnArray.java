//question Link:- https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/inverse-of-an-array-official/ojquestion
package FoundationLevel.Arrays;

import java.io.*;
import java.util.*;

public class InverseOfAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + "\n");
    }
    System.out.println(sb);
  }

  public static int[] inverse(int[] a){
    // write your code here
    int inverse[]=new int[a.length];
    for(int i=0;i<inverse.length;i++){
        inverse[a[i]]=i;
    }
    return inverse;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = inverse(a);
    display(inv);
 }

}
