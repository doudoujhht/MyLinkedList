package com.debut;

public class Test {
    public static void main(String[] args) {
        // write your code here
        MyLinkedList listePrenom=new MyLinkedList();

        listePrenom.printList();

        listePrenom.addToHead(new Node("jean"));

        listePrenom.printList();

        listePrenom.addToTail(new Node("christophe"));

        listePrenom.printList();

        listePrenom.addToTail(new Node("paul"));

        listePrenom.printList();

        listePrenom.addToHead(new Node("emilie"));

        listePrenom.printList();







    }
}
