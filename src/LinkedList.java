import java.util.List;

public class LinkedList {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(23);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println(" ");
        System.out.println("Reversed Linked list");
        list.printList(head);

    }
    public static void printList(Node node){
        while (node!=null){
            System.out.print(node.data+" ");
            node = node.next;
        }
    }
  public static Node reverse(Node node){
        Node prev = null;
        Node current = node;
        while (current!=null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;
  }
}
