package com.debut;

import java.util.LinkedList;

public class MyLinkedList {
    public Node head;// le premier element de la liste

    // un contructeur qui initialise une liste vide
    public MyLinkedList() {
        this.head=null;
    }
    public MyLinkedList(Node head){
        this.head=head;
    }

    public MyLinkedList(Node... args) {
        for (Node arg : args) {
            this.addToTail(arg);
        }
    }

    public void addToHead(Node add){
         if (head==null) head=add;
         else {
             Node second=this.head;
             this.head=add;
             this.head.setNext(second);
         }
    }

    public void addToTail(Node add){
        Node current=head;
        if (current==null) head=add;
        else {
            while (current.getNext()!=null) current=current.getNext();
            current.setNext(add);
        }

    }

    public String printList(){
        StringBuilder output= new StringBuilder("<head> ");
        Node current = head;
        while (current!=null){
            output.append(current.data).append(" ");
            current=current.getNext();
        }
        output.append("<tail>");
        System.out.println(output);
        return output.toString();
    }

    public Node removeTail(){
        Node current=this.head;
        while (current.getNext().getNext()!=null){
            current=current.getNext();
        }
        Node tail=current.getNext();
        current.setNext(null);
        return tail;
    }

    public Node removeHead(){
        Node current=head;
        head=head.getNext();
        return current;

    }


}
