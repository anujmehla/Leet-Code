import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class abcd {
    public static void main(String[] args) {
        String str = "Hello how you are ";
        hello(str);
    }

    public static void hello(String input) {
        StringBuilder sb = new StringBuilder();
        List<String> aList = new ArrayList<>();
        char[] ch = input.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);

            if (ch[i]==' '){
                aList.add(sb.toString());
                sb=new StringBuilder();
            }
        }
        Collections.reverse(aList);
        System.out.println(aList);
    }
}
// input : Hello how you are
//output : are you how Hello