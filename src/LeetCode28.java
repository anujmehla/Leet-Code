public class LeetCode28 {
    public static void main(String[] args) {
        String hayStack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(hayStack, needle));
    }
    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
//        boolean contains = false;
//        int result = 0;
//        if (haystack.contains(needle)) {
//            contains = true;
//        } else {
//            return -1;
//        }
//        if (contains==true) {
//            result = haystack.indexOf(needle);
//        }
//        return result;
    }
}
//output = 0
