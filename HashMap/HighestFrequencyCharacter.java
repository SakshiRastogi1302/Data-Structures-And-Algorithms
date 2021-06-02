//Question Link:- https://www.pepcoding.com/resources/online-java-foundation/hashmap-and-heap/hfc-official/ojquestion
package HashMap;

import java.util.*;

public class HighestFrequencyCharacter {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                int val=hm.get(ch);
                int newVal=val+1;
                hm.put(ch,newVal);
            }
            else{
                hm.put(ch,1);
            }
        }
        
        int maxFreq=Integer.MIN_VALUE;
        char maxFreqChar=' ';
        
        for(Character keys:hm.keySet()){
            if(maxFreq<hm.get(keys)){
                maxFreq=hm.get(keys);
                maxFreqChar=keys;
            }
            else{
                continue;
            }
        }
        
        System.out.println(maxFreqChar);
        
    }

}