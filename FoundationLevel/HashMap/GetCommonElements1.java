//Question Link :- https://www.pepcoding.com/resources/online-java-foundation/hashmap-and-heap/gce1-official/ojquestion
package FoundationLevel.HashMap;

import java.util.*;

public class GetCommonElements1{

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
    
    HashMap<Integer,Boolean> hm=new HashMap<>();
    for(int i=0;i<n1;i++){
        int key1=a1[i];
        if(hm.containsKey(key1)){
          
        }
        else{
            hm.put(key1,true);
        }
    }
    

    for(int j=0;j<n2;j++){
        int key2=a2[j];
        if(hm.containsKey(key2) && hm.get(key2)==true){
            System.out.println(key2);
            hm.put(key2,false);
        }
        else{
            continue;
        }
    }
 }

}
