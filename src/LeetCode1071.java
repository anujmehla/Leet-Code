public class LeetCode1071 {
    public static void main(String[] args) {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        String result = gcdOfString(str1,str2);
        System.out.println(result);
        //output is TAUXX
        //find the greatest common substring
    }
    public static String gcdOfString(String str1,String str2){
        if (!(str1+str2).equals(str2+str1)){
            return "";
        } else if (str1.equals(str2)){//if strings are same
            return str1;
        } else if (str1.length()>str2.length()) {
            return gcdOfString(str1.substring(str2.length()),str2);
        } else {
            return gcdOfString(str2.substring(str1.length()),str1);
        }
    }
}
//solution link " https://www.youtube.com/watch?v=9FblLQKZeKI&ab_channel=%E4%B8%83%E4%BA%BA%E5%B0%8F%E7%BB%84Pleasewatchin2xSPEED
/*incomplete logic logic
*       String result = "";
        if (str1.contains(str2)){
            int index = str1.lastIndexOf(str2);
            result =str1.substring(0,index);
        }
        return result;
* */