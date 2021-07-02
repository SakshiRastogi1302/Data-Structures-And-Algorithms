//Question Link :- https://www.pepcoding.com/resources/online-java-foundation/hashmap-and-heap/lcqs-official/ojquestion
package HashMap;

import java.util.*;

public class LongestConsecutiveSequenceOfElements{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    
    HashMap<Integer,Boolean> hm=new HashMap<>();
    for(int i=0;i<n;i++){
        int val=arr[i];
        if(hm.containsKey(val)){
            
        }
        else{
            hm.put(val,true);
        }
    }
    
    for(Integer keys:hm.keySet()){
        if(hm.containsKey(keys-1)){
            hm.put(keys,false);
        }
        else{
            continue;
        }
    }
    
    int maxSeqSize=0;
    int maxSeqStartingCharacter=-1;
    
    for(int i=0;i<arr.length;i++){
        int key=arr[i];
        if(hm.get(key)){
            int StartingCharacter=key;
            int size=1;
            
            while(hm.containsKey(StartingCharacter+size)){
                size++;
            }
            
            if(maxSeqSize<size){
                maxSeqSize=size;
                maxSeqStartingCharacter=StartingCharacter;
            }
        }
    }
    
    for(int i=maxSeqStartingCharacter;i<maxSeqStartingCharacter+maxSeqSize;i++){
        System.out.println(i);
    }

 }

}