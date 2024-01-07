import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LeetCode94 {
    int val;
    LeetCode94 left;
    LeetCode94 right;
    LeetCode94() {}
    LeetCode94(int val) { this.val = val; }
    LeetCode94(int val, LeetCode94 left, LeetCode94 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
    public static void main(String[] args) {
        LeetCode94 root = new LeetCode94();
        root.val=1;
        root.left=null;
        root.right=new LeetCode94(2);
        root.right.left=new LeetCode94(3);
        List<Integer> list = inorderTraversal(root);
        for (Integer i:list){
            System.out.print(i+" ");
        }
    }
    public static List<Integer> inorderTraversal(LeetCode94 root){
        List<Integer> list  = new ArrayList<>();
        helper(root,list);
        return list;
    }
    public static void helper(LeetCode94 root,List<Integer> list){
        if (root==null)
            return;
        helper(root.left,list);
        list.add(root.val);
        helper(root.right,list);
    }
}