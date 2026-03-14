package org.example.exercisesInsertionSort;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    public static class LinkNode {
        int value;
        LinkNode next;

        public LinkNode(int value , LinkNode next){
            this.value = value;
            this.next = next;
        }
    }

    public LinkNode head;
    public LinkNode tail;

    public LinkedList(){
        this.head = new LinkNode(-1, null);
        this.tail = this.head;

    }

    public LinkedList(LinkNode linkNode){
        this.head = linkNode;
        this.tail = this.head;

    }

    public int get(int index) {
        LinkNode curr = this.head;
        int count = 0;
        while(curr != null){

            if(index == count){
                return curr.value;
            }
            curr = curr.next; // testar depois com dummy
            count++;
        }
        return -1;
    }

    public void insertHead(int val) {
        LinkNode node = new LinkNode(val, null);
        node.next = this.head.next;
        this.head.next = node;

        if(this.tail.next != null){
            this.tail = node;
        }

    }

    public void insertTail(int val){
        LinkNode node = new LinkNode(val,null);
        this.tail.next = node;
        this.tail = node;

    }

    public boolean remove(int index) {
        LinkNode curr = this.head;
        int i = 0;

        while(i < index && curr != null){
            curr = curr.next;
            i++;
        }

        if(curr != null && curr.next != null){
            if(curr.next == this.tail){
                this.tail = curr;
            }
            curr.next = curr.next.next;
            return true;
        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        LinkNode curr = this.head;

        while(curr != null){
            values.add(curr.value);
            curr = curr.next;
        }
        return values;

    }


}
