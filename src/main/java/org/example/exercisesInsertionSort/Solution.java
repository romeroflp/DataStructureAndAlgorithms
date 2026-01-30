package org.example.exercisesInsertionSort;

public class Solution {
    public ListNode insertionSortList(ListNode head) {

        ListNode current = head;
        ListNode nextNode = head.next;

        while(nextNode != null){
            if(current.val > nextNode.val){
                current = nextNode;
            }
            nextNode = nextNode.next;
        }

        return current;

    }



}
// Tenho que instanciar um ListNode que linka no outro, porem de forma ordenada