/**
 * Created by manhnv118 on 8/22/2017.
 */
public class SinglyLinkedList {

    private class Node {
        int value;
        Node nextNode;

        private Node(int value) {
            this.value = value;
        }
    }

    private Node head = null;
    private Node tail = null;

    public void add(int value) {
        Node node = new Node(value);

        //If size = 0
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.nextNode = node;
            tail = node;
        }
    }

    public void removeTail() {
        if (head == null) {
            return;
        }
        if (head.equals(tail)) {
            head = null;
            tail = null;
            return;
        }

        Node node = head;
        while (node.nextNode != null) {

            // If next node is tail.
            if (node.nextNode.equals(tail)) {
                node.nextNode = null; // remove tail ( next node)
                tail = node;  //re-assign tail = current node
            } else {
                node = node.nextNode; //continue loop until meet tail
            }
        }
    }

    public void removeGreaterThan(int value) {
        Node node = head;
        while (node != null) {
            if (node.equals(head) && node.value > value) {
                head = head.nextNode;
                node = head;
                if (head == null) tail = null; // list is empty. tail = head = null
            } else if (node.nextNode != null && node.nextNode.value > value) {
                node.nextNode = node.nextNode.nextNode;
                if (node.nextNode == null) tail = node; // meet tail
            } else {
                if (node.nextNode == null) tail = node; // meet tail
                node = node.nextNode;
            }
        }
    }

    @Override
    public String toString() {
        String s = "[";
        Node node = head;
        while (node != null) {
            if (!s.equals("[")) s += ", ";
            s += node.value;
            node = node.nextNode;
        }
        s += "]";
        return s;
    }
}
