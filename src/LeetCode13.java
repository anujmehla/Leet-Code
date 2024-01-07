import java.util.Stack;
public class LeetCode13 {
    public static void main(String[] args) {
        String s = "()[]}";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            char current = s.charAt(i);
            if (isOpening(current)){
                stack.push(current);
            } else {
                if (stack.isEmpty()){
                    return false;
                } else if (!isMatching(stack.peek(),current)){
                    return false;
                }
                else
                    stack.pop();
            }
        }
        return true;
    }
    public static boolean isOpening(char current){
        return current=='(' || current=='[' || current=='{';
    }
    public static boolean isMatching(char a,char b){
        return ( a=='(' && b==')') || ( a=='[' && b==']') || ( a=='{' && b=='}');
    }
}