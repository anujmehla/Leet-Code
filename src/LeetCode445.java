import java.util.Stack;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val,ListNode next){
        this.val=val;
        this.next=next;
    }
}
public class LeetCode445 {
    public static void main(String[] args) {
        ListNode l1= new ListNode(7);
        l1.next.val=2;
        l1.next.next.val=4;
        l1.next.next.next.val=3;

        ListNode l2 = new ListNode(5);
        l2.next.val=6;
        l2.next.next.val=4;

        ListNode l3 = addTwoNumbers(l1,l2);
        System.out.println(l3);
    }
    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1!=null){
            stack1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            stack2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        ListNode newHead = null;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry!=0){
            int n1 = stack1.isEmpty() ? 0 : stack1.pop();
            int n2 = stack2.isEmpty() ? 0 : stack2.pop();
            int tmp = n1+n2 +carry;
             ListNode newNode = new ListNode(tmp%10);
             newNode.next = newHead;
             newHead = newNode;
             carry = tmp/10;
        }
        return newHead;
    }
}
