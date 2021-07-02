package FoundationLevel.LinkedLists;

import java.util.*;

public class LinkedListImplementation {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        public void addLast(int val){
            Node node=new Node();
            node.data=val;
            if(size==0){
                head=tail=node;
                size++;
            }
            else{
                tail.next=node;
                tail=node;
                size++;
            }
        }

        public void display(){
            if(head==null){

            }
            else{
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
            }
        }
    }

    public static void main(String [] args){
        LinkedList ll=new LinkedList();
        ll.addLast(10);
        ll.addLast(20);
        ll.addLast(30);
        ll.display();
    }
}
