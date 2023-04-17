import java.util.*;

class RemoveDups {
    public static Node removeDuplicatesLL(Node head) {
        Node fast = head, old = head;
        Map<Integer, Integer> map = new HashMap<>();
        while (head.next != null) {
            if (!map.containsKey(head.data)) {
                map.put(head.data, head.data);
                old = head;
                head = head.next;
            } else {
                if (head.next != null) {
                    old.next = old.next.next;
                    head = head.next;
                    System.out.println(head.data);
                } else {
                    old.next = null;
                    System.out.println("here");
                }
            }
        }
        if (head != null) {
            if (!map.containsKey(head.data)) {
                map.put(head.data, head.data);
                old = head;
                head = head.next;
            } else
                old.next = null;
        }
        return fast;
    }

    public static void main(String[] args) {
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(1);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);
        Node node8 = new Node(8);
        Node node9 = new Node(9);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node9;
        Node.displayLL(node1);
        Node result = removeDuplicatesLL(node1);
        System.out.println();
        Node.displayLL(result);
    }
}