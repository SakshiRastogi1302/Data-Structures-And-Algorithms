package Arrays;
// Question Link :- https://www.pepcoding.com/resources/online-java-foundation/function-and-arrays/find-element-in-array-official/ojquestion
import java.util.*;

public class FindElementInAnArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int searchElement=sc.nextInt();
    
    for(int i=0;i<arr.length;i++){
        if(arr[i]==searchElement){
            System.out.println(i);
            return;
        }
        else{
            continue;
        }
    }
    
    System.out.println("-1");
 }

}
