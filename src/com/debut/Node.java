package com.debut;

public class Node {
    public String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next=null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
