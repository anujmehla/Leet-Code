class LeetCode21 {
    int val;
    LeetCode21 next;
    LeetCode21 (){}
    LeetCode21(int val){
        this.val=val;
    }
    LeetCode21(int val,LeetCode21 next){
        this.val=val;
        this.next=next;
    }
    public static void main(String[] args) {

    }
    public static LeetCode21 mergeTwoLists(LeetCode21 list1,LeetCode21 list2){
        LeetCode21 tempNode = new LeetCode21(0);
        LeetCode21 current = tempNode;
        while (list1!=null && list2!=null){
            if(list1.val<list1.val){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next=list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        return tempNode.next;
    }
}
//    Node head;
//
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int d) {
//            data = d;
//            next = null;
//        }
//    }
//
//    public static LeetCode21 insert(LeetCode21 list, int data) {
//        Node newNode = new Node(data);
//        if (list.head == null) {
//            list.head = newNode;
//        } else {
//            Node last = list.head;
//            while (last.next != null) {
//                last = last.next;
//            }
//            last.next = newNode;
//        }
//        return list;
//    }
//
//    public static void print(LeetCode21 list) {
//        Node currentNode = list.head;
//        System.out.println("Linked List: ");
//        while (currentNode != null) {
//            System.out.print(currentNode + " ");
//            currentNode = currentNode.next;
//        }
//    }
//
//    public static LeetCode21 delete(LeetCode21 list, int key) {
//        Node current = list.head, prev = null;
//        if (current != null && current.data == key) {
//            list.head = current.next;
//            System.out.println(key + "found and deleted");
//            return list;
//        }
//
//        while (current != null && current.data != key) {
//            prev = current;
//            current = current.next;
//        }
//        if (current != null) {
//            prev.next = current.next;
//            System.out.println(key + " found and deleted");
//        }
//        if (current == null) {
//            System.out.println(" Not found");
//        }
//
//        return list;
//    }
//
//    public static void main(String[] args) {
//        LeetCode21 list = new LeetCode21();
//        list = insert(list, 1);
//        list = insert(list, 2);
//        list = insert(list, 3);
//
//        print(list);
//        delete(list,1);
//        print(list);
//    }