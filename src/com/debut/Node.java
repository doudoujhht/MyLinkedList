package com.debut;

public class Node {
    public String data; // la donnée que chaque node contient
    private Node next; // la prochaine node de la liste

    /*
    * c'est un constructeur qui permet de mettre des donnée a la creation d'une node */
    public Node(String data) {
        this.data = data;
        this.next=null;//quand on cree une node elle ne connait pas la prochaine jusqu'a ce qu'on la crée
    }

    //getter pour le prochain node
    public Node getNext() {
        return next;
    }

    // setter pour le prochain node
    public void setNext(Node next) {
        this.next = next;
    }
}
