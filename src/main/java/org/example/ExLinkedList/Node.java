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

    public Solution(Node node){
        this.newNode = node;
    }

    public Node reverseList(Node head) {

        while(head != null){
            newNode = new Node(head.val, newNode);
            head = head.next;
        }

        return newNode;

    }

    public boolean hasCycle(Node head ){
        if(head == null){
            return false;

        }

        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                return true;
            }

        }

        return false;

    }

    public Node middleNode(Node head){
        if(head == null){
            return null;
        }

        int count = 0;
        Node fast = head;
        Node slow = head;

        while(fast.next != null && fast.next.next != null){

            fast = fast.next.next;
            slow = slow.next;
            count++;
        }
        if(fast.next != null){
            return slow.next;
        }
        return slow;
    }
// [1,2,3,4,5, 6]
    public int get(int index) {
        Node curr = this.newNode;
        for (int i = 0; i < index; i++) {
            if (curr.next == null) {
                throw new IndexOutOfBoundsException("O valor do índice excedeu o tamanho da lista.");
            }
            curr = curr.next;
        }
        return curr.val;

    }

}






class Main {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);







        Solution solution = new Solution(new Node(1, new Node(2, new Node(3, new Node(4)))));

        System.out.println(solution.get(3));
    }
}
