public class LeetCode206 {
    int val;
    LeetCode206 next;
    LeetCode206() {}
    LeetCode206(int val) { this.val = val; }
    LeetCode206(int val, LeetCode206 next) {
        this.val = val;
        this.next = next;
    }
    public static void main(String[] args) {
        LeetCode206 head= new LeetCode206(1);
        head.next = new LeetCode206(2);
        head.next.next=new LeetCode206(3);
        head.next.next.next=new LeetCode206(4);
        head.next.next.next.next=new LeetCode206(5);
        printList(head);
        LeetCode206 prev =reverseList(head);
        printList(prev);

    }
    public static LeetCode206 reverseList(LeetCode206 head){
        LeetCode206 previous = null;
        while(head!=null){
            LeetCode206 temp = head.next;
            head.next = previous;
            previous = head;
            head = temp;
        }
        return previous;

    }
    public static void printList(LeetCode206 node){
        LeetCode206 current = node;
        System.out.println("Linked List: ");
        while(current!=null){
            System.out.print(current.val+" ");
            current=current.next;
        }
    }
}
