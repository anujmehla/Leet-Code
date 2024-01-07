import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode187 {
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> result = findRepeatedDnaSequence(s);
        for (String t:result){
            System.out.print(t+" ");
        }
    }
    public static List<String> findRepeatedDnaSequence(String s){
        Map<String,Integer> map = new HashMap<>();
        for (int i=0; i<=s.length()-10; i++){
            String substring = s.substring(i,i+10);
            map.put(substring,map.getOrDefault(substring,0)+1);
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String,Integer> item:map.entrySet()){
            if (item.getValue()>1){
                list.add(item.getKey());
            }
        }
        return list;
    }
}
