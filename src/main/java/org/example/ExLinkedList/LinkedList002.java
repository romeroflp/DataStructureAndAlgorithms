package org.example.ExLinkedList;

import java.util.List;

public class LinkedList002 {

    public static class ListNode {
        int val;
        ListNode next;
        public ListNode() {}
        public ListNode(int val) { this.val = val; }
        public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            StringBuilder listFormat = new StringBuilder("[");

            while(next != null){

                listFormat.append(next.val).append(", ");
                next = next.next;
            }

            listFormat.append("]");
            return listFormat.toString();
        }

    }
    public ListNode node;

    public LinkedList002(ListNode list){
        this.node = list;
    }


    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while(curr != null){
            if(curr.val == curr.next.val){
                curr = curr.next;
            }else{
                curr.next = curr;
            }


        }


        return head;


    }

    @Override
    public String toString() {
        StringBuilder listFormat = new StringBuilder("[");

        if(this.node == null){
            listFormat.append("]");
            return listFormat.toString();
        }

        while(true){
            if(this.node.next == null){
                listFormat.append(this.node.val);
                break;
            }

            listFormat.append(this.node.val).append(", ");
            this.node = this.node.next;
        }

        listFormat.append("]");
        return listFormat.toString();
    }

}
