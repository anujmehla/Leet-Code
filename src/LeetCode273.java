import java.util.HashMap;
import java.util.Map;

public class LeetCode273 {
    public static void main(String[] args) {
        int num=12;
        String s = numberToWords(num);
        System.out.println(s);

    }
    public static String numberToWords(int num){
        Map<Integer,String> word = new HashMap<>();
        word.put(0,"zero");
        word.put(1,"one");
        word.put(2,"two");
        word.put(3,"three");
        word.put(4,"four");
        word.put(5,"five");
        word.put(6,"siz");
        word.put(7,"seven");
        word.put(8,"eight");
        word.put(9,"nine");
        word.put(10,"ten");
        word.put(11,"eleven");
        word.put(12,"twelve");
        word.put(13,"thirteen");
        word.put(14,"fourteen");
        word.put(15,"fifteen");
        word.put(16,"sixteen");
        word.put(17,"seventeen");
        word.put(18,"eighteen");
        word.put(19,"nineteen");
        word.put(20,"twenty");
        word.put(30,"thirty");
        word.put(40,"forty");
        word.put(50,"fifty");
        word.put(60,"sixty");
        word.put(70,"seventy");
        word.put(80,"eighty");
        word.put(90,"ninety");
        word.put(100,"hundred");
        word.put(1000,"thousand");
        word.put(1000000,"million");
        word.put(1000000000,"billion");

        char[] ch = String.valueOf(num).toCharArray();
        int len= ch.length;
        switch (len){
            case 1:
                System.out.println(word.get(num));
                break;
            case 2:
                if (num<20)
                System.out.println(word.get(num));
                else
                break;
            case 3:
                System.out.println("length of the number is three");
                break;
            case 4:
                System.out.println("length of the number is four");
                break;
            case 5:
                System.out.println("length of the number is five");
                break;
            case 6:
                System.out.println("length of the number is six");
                break;
            case 7:
                System.out.println("length of the number is seven ");
                break;
            case 8:
                System.out.println("length of the number is eight");
                break;
            case 9:
                System.out.println("length of the number is nine");
                break;
            case 10:
                System.out.println("length of the number is ten");
                break;
            default:
                System.out.println("Out of my reach!");
                break;

        }

        return "";

    }
}
