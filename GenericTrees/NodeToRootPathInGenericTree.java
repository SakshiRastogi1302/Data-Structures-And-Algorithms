//Question Link:- https://classroom.pepcoding.com/myClassroom/the-placement-program-pitampura-jan-15-2021/generic-tree/node-to-root-path-official/ojquestion
package GenericTrees;

import java.io.*;
import java.util.*;

public class NodeToRootPathInGenericTree {
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

 public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
    if(node.data==data){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(node.data);
        return al;
    }
    
    for(Node childNode:node.children){
        ArrayList<Integer> result=nodeToRootPath(childNode,data);
        if(result.size()>0){
            result.add(node.data);
            return result;
            
        }
        
    }
    
    return new ArrayList<Integer>();
    
    
 }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    ArrayList<Integer> path = nodeToRootPath(root, data);
    System.out.println(path);
    // display(root);
  }

}