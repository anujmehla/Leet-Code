import java.util.Stack;

public class LeetCode735 {
    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        int [] result = asteroidCollision(asteroids);
        for (int i:result){
            System.out.print(i+" ");
        }
    }
    public static int[] asteroidCollision(int[] asteroids) {
        if(asteroids.length <=1)
            return asteroids;

        Stack<Integer> stack = new Stack<>();

        for (int i=0; i<asteroids.length; i++){
            if (asteroids[i]>0)
                stack.push(asteroids[i]);
            else {
                while (!stack.empty() &&stack.peek()<Math.abs(asteroids[i])) {
                    stack.pop();
                }
                if(stack.empty() || stack.peek()<0) {
                    stack.push(asteroids[i]);
                } else if (stack.peek()==Math.abs(asteroids[i])) {
                    stack.pop();
                }
            }
        }

        int[] arr = new int[stack.size()];
        for (int i= arr.length-1; i>=0; i--)
            arr[i]=stack.pop();

        return arr;
    }
}