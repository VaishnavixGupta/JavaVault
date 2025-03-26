package com.java.LinkedList.SinglyLinked;

public class SinglyLL {
    Node head;
    Node tail;
    int size;
    public SinglyLL() {
        this.size=0;
    }

    public class Node{
       int value;
       Node next;
       public Node(int value){
           this.value = value;
       }
       public Node(int value,Node next){
           this.value=value;
           this.next=next;
       }
    }

    //insertion from beginning
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    //insertion from last
    public void insertLast(int value){
        Node node = new Node(value);
    }


    public static void main(String[] args) {

    }
}
