package org.example.ExLinkedList;

public class LinkedList001 {
    public static class Node{
        public int val;
        public Node next;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;

    public void addHead(int num){
        this.head = new Node(num,head);
        if(this.tail == null){
            this.tail = head;
        }
    }


    public void addTail(int num){
        if(this.head == null){
            addHead(num);
            return;
        }

        Node node = new Node(num, null);
        this.tail.next = node;
        this.tail = node;

    }

    public void removeHead(){
        if (this.head.next == null) {
            this.head = null;
            return;
        }
        this.head = this.head.next;

    }

    public void removeTail(){

        try{
            if (this.head.next == null) {
                this.head = null;
                return;
            }

            Node curr = this.head;

            while (curr.next.next != null) {
                curr = curr.next;
            }
            this.tail = curr;
        }catch(NullPointerException e){
            throw new RuntimeException("A lista está vazia. Nenhum elemento foi removido");
        }


    }

    public void insert(int index, int num){
        if(index < -1){
            throw new IndexOutOfBoundsException("Indíces negativos são inválidos.");
        }

        if(index == 0){
            addHead(num);
            return;
        }

        Node curr = this.head;
        int count = 0;

        while (count < index - 1 && curr != null) {
            curr = curr.next;
            count++;
        }
        if(curr == null){
            throw new NullPointerException("O índice excedeu o tamanho da lista");
        }

        Node newNode = new Node(num, curr.next);
        curr.next = newNode;

        if(newNode.next == null){
            this.tail = curr;
        }

    }


    public int size(){
        Node curr = this.head;
        int count = 0;

        while(curr != null){
            count++;
            curr = curr.next;

        }
        return count;

    }

    public Node get(int index){
        Node curr = this.head;
        for (int i = 0; i <= index ; i++) {
            if(curr == null){
                throw new IndexOutOfBoundsException("O valor do índice excedeu o tamanho da lista.");
            }
            curr = curr.next;


        }
        return curr;

    }


    @Override
    public String toString() {
        StringBuilder listFormat = new StringBuilder("[");
        Node curr = head;

        if(curr == null){
            listFormat.append("]");
            return listFormat.toString();
        }

        while(true){
            if(curr.next == null){
                listFormat.append(curr.val);
                break;
            }

            listFormat.append(curr.val).append(", ");
            curr = curr.next;
        }

        listFormat.append("]");
        return listFormat.toString();
    }
}


