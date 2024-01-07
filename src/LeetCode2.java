import java.util.LinkedList;
import java.util.Queue;

class ListNode1{
    int val;
    ListNode1 next;
    ListNode1(){}
    ListNode1(int val){
        this.val=val;
    }
    ListNode1(int val,ListNode1 next){
        this.val=val;
        this.next=next;
    }
}
public class LeetCode2 {
    public static void main(String[] args) {
        ListNode1 listNode1 = new ListNode1(2);
        listNode1.next = new ListNode1(4);
        listNode1.next.next = new ListNode1(3);

        ListNode1 listNode2 = new ListNode1(5);
        listNode2.next=new ListNode1(6);
        listNode2.next.next=new ListNode1(4);

        ListNode1 result = addTwoNumbers(listNode1,listNode2);
        System.out.println(result);

    }
    public static ListNode1 addTwoNumbers(ListNode1 list1,ListNode1 list2){
        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        while (list1!=null){
            queue1.add(list1.val);
            list1=list1.next;
        }
        while (list2!=null){
            queue2.add(list2.val);
            list2=list2.next;
        }
        System.out.println("The elements in the queue1 are "+queue1);//2,4,3
        System.out.println("The elements in the queue2 are "+queue2);//5,6,4

        ListNode1 result = new ListNode1();
        while (queue1.size()>0 || queue2.size()>0){
            result = new ListNode1(queue1.poll()+queue2.poll());
            System.out.print("Am i visited "+result.val+", ");
            result=result.next;
        }
        while (result!=null){
            System.out.print(result.val);
            result=result.next;
        }


        return result;
    }
}