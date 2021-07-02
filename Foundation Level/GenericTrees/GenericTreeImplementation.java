package GenericTrees;

import java.util.*;

public class GenericTreeImplementation {
    public static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();  //This ArrayList of children will be created at the time of parsing.
    }

    public static Node constructGenericTree(int arr[]){
        Stack<Node> st=new Stack<>();
        Node root=new Node();
        root.data=arr[0];

        st.push(root);
        for(int i=1;i<arr.length;i++){

            if(arr[i]==-1){
                st.pop();
            }
            else{
                Node node=new Node();
                node.data=arr[i];
                if(st.size()!=0){
                    Node topNode=st.peek();
                    topNode.children.add(node);
                    st.push(node);  
                }
            }
        }

        return root;
    }


    public static void display(Node node){
        String str=node.data+" -> ";
        for(Node child:node.children){
            str+=child.data+",";
        }

        str+=".";
        System.out.println(str);

        for(Node childNode:node.children){
            display(childNode);
        }
    }


    public static void main(String[]args){
        int arr[]={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40};
        Node root=constructGenericTree(arr);
        // System.out.println(root.data);
        display(root);
    }





}
