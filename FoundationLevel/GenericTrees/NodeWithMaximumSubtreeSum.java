//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/generic-tree/node-with-maximum-subtree-sum-official/ojquestion
package FoundationLevel.GenericTrees;

import java.io.*;
import java.util.*;

public class NodeWithMaximumSubtreeSum {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  static int maxN=0;
  static int maxSum=Integer.MIN_VALUE;
  public static int maxSumOfSubTree(Node node){
      int sum=0;
      for(Node child:node.children){
          int childSum=maxSumOfSubTree(child);
          sum+=childSum;
      }
      
      sum+=node.data;
      
      if(maxSum<sum){
          maxSum=sum;
          maxN=node.data;
      }
      
      return sum;
      
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    // write your code here
    maxSumOfSubTree(root);
    System.out.println(maxN+"@"+maxSum);
  }

}