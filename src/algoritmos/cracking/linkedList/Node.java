package algoritmos.cracking.linkedList;

public class Node {
    Node next = null;
    int data;

    public Node(int data) {
        if (data < 0) {
            throw new IllegalArgumentException("No puede agregar números menores que 0");
        }
        this.data = data;
    }

    void appendToTail(int data) {
        if (data < 0) {
            throw new IllegalArgumentException("No puede agregar números menores que 0");
        }
        Node end = new Node(data);
        Node node = this;
        while (node.next != null) {
            node = node.next;
        }
        node.next = end;
    }

    Node deleteNode(Node head, int data) {
        Node node = head;
        if (node.data == data) {
            return head.next; /* moved head */
        }
        while (node.next != null) {
            if (node.next.data == data) {
                node.next = node.next.next;
                return head; /* head didn't change */
            }
            node = node.next;
        }
        return head;
    }

    public void getData() {
        Node node = this;
        while (node.data != 0) {
            System.out.println(node.data);
            if (node.next==null){
                break;
            }
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(1);
        node.appendToTail(2);
        node.appendToTail(3);
        node.appendToTail(4);
//        node.deleteNode(node, 3);
        node.getData();
    }

}
