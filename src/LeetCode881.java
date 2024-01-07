import java.util.Arrays;

public class LeetCode881 {
    public static void main(String[] args) {
        int[] people = {3,5,3,4};
        int limit =5;
        //output = 4
        System.out.println(numRescueBoats(people,limit));
    }
    public static int numRescueBoats(int[] people, int limit) {
        int boat = 0;
        Arrays.sort(people);
        for (int i = 0; i < people.length-1; i++) {
            if (people[i]+people[i+1]<=limit) {
                boat++;
                i++;
            } else if (people[i]<=limit) {
                boat++;
            }
        }
        return boat;
    }
}


//Question
/*
You are given an array people where people[i] is the weight
of the ith person, and an infinite number of boats where each
boat can carry a maximum weight of limit. Each boat carries
at most two people at the same time, provided the sum of the
weight of those people is at most limit.

Return the minimum number of boats to carry every given person.

Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)

Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
* */