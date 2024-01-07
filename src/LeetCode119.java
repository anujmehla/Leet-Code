import java.util.ArrayList;
import java.util.List;

public class LeetCode119 {
    public static void main(String[] args) {
        int rowIndex = 1;
        List<Integer> ans = getRow(rowIndex);
        System.out.println(ans);

        String abcd = "2";
        System.out.println("ABCD "+abcd);
        Long ab = Long.parseLong(abcd);
        System.out.println(ab);

        String[] studnetId = {"1","2"};
        for (String abced : studnetId){
            System.out.println(abced);
        }

    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        if (rowIndex==0) {
            ans.add(1);
            return ans;
        } else {
//            for (in)
        }

        return ans;
    }
}
