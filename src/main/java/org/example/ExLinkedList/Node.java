package org.example.ExLinkedList;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node curr = this;

        while (curr != null) {
            sb.append(curr.val);

            if (curr.next != null) {
                sb.append(" -> ");
            }

            curr = curr.next;
        }

        sb.append(" -> null");
        return sb.toString();
    }


}

class Solution {
    Node newNode;

    public Node reverseList(Node head) {

        while(head != null){
            newNode = new Node(head.val, newNode);
            head = head.next;
        }

        return newNode;

    }

    public boolean hasCycle(Node head){
        if(head == null){
            return false;
        }

        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }


        }
        return false;

    }

    public Node middleNode(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){

            fast = fast.next.next;
            slow = slow.next;


        }

        return slow;

    }




}


class Main {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);


        // Montando a lista
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;





        Solution solution = new Solution();

        System.out.println(solution.middleNode(n1));
    }
}
