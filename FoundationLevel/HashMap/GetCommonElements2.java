//Question Link :- https://www.pepcoding.com/resources/online-java-foundation/hashmap-and-heap/gce2-official/ojquestion
package FoundationLevel.HashMap;

import java.util.*;

public class GetCommonElements2{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    int a1[]=new int[n1];
    for(int i=0;i<n1;i++){
        a1[i]=sc.nextInt();
    }
    
    int n2=sc.nextInt();
    int a2[]=new int[n2];
    for(int i=0;i<n2;i++){
        a2[i]=sc.nextInt();
    }
    
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<n1;i++){
        int key=a1[i];
        if(hm.containsKey(key)){
            int val=hm.get(key);
            int newVal=val+1;
            hm.put(key,newVal);
        }
        else{
            hm.put(key,1);
        }
    }
    
    for(int j=0;j<n2;j++){
        int key=a2[j];
        if(hm.containsKey(key) && hm.get(key)!=0){
            System.out.println(key);
            int val=hm.get(key);
            int newVal=val-1;
            hm.put(key,newVal);
        }
        else{
            continue;
        }
    }
    
    
 }

}