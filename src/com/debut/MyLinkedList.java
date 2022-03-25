package com.debut;

import java.util.LinkedList;

public class MyLinkedList {
    public Node head;// le premier element de la liste

    // un contructeur qui initialise une liste vide
    public MyLinkedList() {
        this.head=null;
    }

    // un construteur dans lequel on passe des string pour en faire des Node
    public MyLinkedList(String... args) {
        // chaque string creer un nouveau node et le rajoute à la fin
        for (String arg : args) {

            Node node=new Node(arg);// ca creer un node avec le string
            this.addToTail(node);//ca ajoute le nouveau node à la fin de la liste
        }
    }

    public MyLinkedList(Node... args) {
        for (Node arg : args) {
            //ca ajoute les node à la fin de la liste
            this.addToTail(arg);
        }
    }

    public void addToHead(Node add){
         if (head==null) head=add;// si la liste est vide ajouter le node

         else {
             //si la liste n'est pas vide on rajoute le nouveau node comme head et on met l'ancien head comme node suivant
             Node second=this.head;
             this.head=add;
             this.head.setNext(second);
         }
    }
    public void addToHead(String node){
        // le meme constructeur qu'en haut mais qui prends un String en parametre
        Node add=new Node(node);
        if (head==null) head=add;// si la liste est vide ajouter le node

        else {
            //si la liste n'est pas vide on rajoute le nouveau node comme head et on met l'ancien head comme node suivant
            Node second=this.head;
            this.head=add;
            this.head.setNext(second);
        }
    }

    public void addToTail(Node add){
        // si le la liste est vide rajouter l'element
        Node current=head;
        if (current==null) head=add;
        else {
            while (current.getNext()!=null) current=current.getNext();
            current.setNext(add);
        }

    }

    public void addToTail(String node){
        Node add=new Node(node);
        // si le la liste est vide rajouter l'element
        Node current=head;
        if (current==null) head=add;        // si le la liste est vide rajouter l'element
        else {
            while (current.getNext()!=null) current=current.getNext();// faire le tour de la boucle pour retrouver le dernier node
            current.setNext(add);//faire que le node apres le dernier soit le nouveau dernier
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
        // ca renvoit un node au qu'au ou on veut faire quelque chose avec le node suprimmé
        Node current=this.head;
        while (current.getNext().getNext()!=null){
            current=current.getNext();
        }
        Node tail=current.getNext();
        current.setNext(null);
        return tail;
    }

    // ca renvoit un node au qu'au ou on veut faire quelque chose avec le node suprimmé
    public Node removeHead(){
        Node current=head;
        head=head.getNext();
        return current;

    }


}
