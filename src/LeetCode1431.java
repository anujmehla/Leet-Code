import java.util.ArrayList;
import java.util.List;

public class LeetCode1431 {
    public static void main(String[] args) {
        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        List<Boolean> list = kidsWithCandies(candies,extraCandies);
        System.out.print("The list contains :");
        for (boolean b:list){
            System.out.print(b+" ");
        }
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int tmp=-1;

        for (int i=0; i<candies.length; i++){
            candies[i]+=extraCandies;
            System.out.print("The candies after addition "+candies[i]);
            System.out.println();
            tmp=0;
            for (int j=0; j<candies.length; j++){
                if (candies[j]<=candies[i]){
                    tmp++;
                    System.out.println("The value of j and tmp "+candies[j]+" "+tmp);
                }
                System.out.println("Interior Loop finished\n");;
            }
            System.out.println(" The value of tmp is  "+tmp);
            if (tmp>3){
                list.add(true);
            } else list.add(false);
            System.out.println("External loop finished\n");
        }
        return list;
    }
}