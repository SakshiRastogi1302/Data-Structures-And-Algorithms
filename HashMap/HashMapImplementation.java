package HashMap;

import java.io.*;
import java.util.*;

public class HashMapImplementation {

  public static class HashMap<K, V> {
    private class HMNode {
      K key;
      V value;

      HMNode(K key, V value) {
        this.key = key;
        this.value = value;
      }
    }

    private int size; // n
    private LinkedList<HMNode>[] buckets; // N = buckets.length

    public HashMap() {
      initbuckets(4);
      size = 0;
    }

    private void initbuckets(int N) {
      buckets = new LinkedList[N];
      for (int bi = 0; bi < buckets.length; bi++) {
        buckets[bi] = new LinkedList<>();
      }
    }

    public void put(K key, V value) throws Exception {
      // write your code here
      int bi=hashFunction(key);
      int di=getElementIndexWithinBucket(key,bi);

      if(di==-1){
          buckets[bi].addLast(new HMNode(key,value));
          size++;
      }
      else{
          buckets[bi].get(di).value=value;
      }

      double lambda=size*1.0/buckets.length;
      if(lambda>2.0){
          rehash();
      }
    }

    public void rehash() throws Exception{
        LinkedList<HMNode> old_bucket[]=buckets;

        initbuckets(2*old_bucket.length);
        size=0;

        for(int i=0;i<old_bucket.length;i++){
            for(HMNode node:old_bucket[i]){
                put(node.key,node.value);
            }
        }
    }

    public int hashFunction(K key){
    /*The hashCode method is an inbuilt method in Java that returns the integer hashed value of the input value.
     If two or more objects are equal according to the equals method, then their hashes should be equal too. 
     If two or more objects are not equal according to the equals method, then their hashes can be equal or unequal.
     Hashcode function is available with keys, Integer, Boolean, Strings etc.
     */
     
        int bi=key.hashCode();  
    /*HashCode it can return an integer which can be +ve, -ve, small or large. But we want a bucket index which lies 
      between 0 and length of bucket array i.e.4 */
        return Math.abs(bi % buckets.length);
    }

    public int getElementIndexWithinBucket(K key, int bi){
        LinkedList<HMNode> ll=buckets[bi];
        for(int i=0;i<ll.size();i++){
            HMNode node=ll.get(i);
            if(node.key.equals(key)){
                return i;
            }
        }

        return -1;
    }

    public V get(K key) throws Exception {
      // write your code here
      int bi=hashFunction(key);
      int di=getElementIndexWithinBucket(key,bi);

      if(di==-1){
          return null;
      }
      else{
          return buckets[bi].get(di).value;
      }
    }

    public boolean containsKey(K key) {
      // write your code here
      int bi=hashFunction(key);
      int di=getElementIndexWithinBucket(key,bi);

      if(di==-1){
          return false;
      }
      else{
         return true;
      }
    }

    public V remove(K key) throws Exception {
      // write your code here
      int bi=hashFunction(key);
      int di=getElementIndexWithinBucket(key,bi);

      if(di==-1){
         return null;
      }
      else{
          HMNode node=buckets[bi].remove(di);
          size--;
          return node.value;
      }
    }

    public ArrayList<K> keyset() throws Exception {
      // write your code here
      ArrayList<K> al=new ArrayList<>();

      for(int i=0;i<buckets.length;i++){
          for(int j=0;j<buckets[i].size();j++){
              al.add(buckets[i].get(j).key);
          }
      }

      return al;
    }

    public int size() {
      // write your code here
      return size;
    }

   public void display() {
      System.out.println("Display Begins");
      for (int bi = 0; bi < buckets.length; bi++) {
        System.out.print("Bucket" + bi + " ");
        for (HMNode node : buckets[bi]) {
          System.out.print( node.key + "@" + node.value + " ");
        }
        System.out.println(".");
      }
      System.out.println("Display Ends");
  }
}

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("put")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        Integer val = Integer.parseInt(parts[2]);
        map.put(key, val);
      } else if (str.startsWith("get")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.get(key));
      } else if (str.startsWith("containsKey")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.containsKey(key));
      } else if (str.startsWith("remove")) {
        String[] parts = str.split(" ");
        String key = parts[1];
        System.out.println(map.remove(key));
      } else if (str.startsWith("size")) {
        System.out.println(map.size());
      } else if (str.startsWith("keyset")) {
        System.out.println(map.keyset());
      } else if (str.startsWith("display")) {
        map.display();
      }
      str = br.readLine();
    }
  }
}