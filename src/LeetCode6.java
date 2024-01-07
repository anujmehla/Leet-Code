public class LeetCode6 {
    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        int numberOfRows = 3;
        String output = convert(input,3);
        System.out.println(output);
    }
    public static String convert(String s,int numRows) {
        if(numRows ==1) {
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];
        int row = 0;
        int dir = 0;

        for(int i = 0; i < sbs.length; i++) {
            sbs[i] = new StringBuilder();
        }
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            row += dir;
            sbs[row].append(c);

            if(row==0 || row == numRows-1) {
                dir = (dir ==0) ? 1 : -dir;
            }
        }
        return convert(sbs);
    }
    public static String convert(StringBuilder[] sbs) {
        StringBuilder result = new StringBuilder();

        for(StringBuilder sb: sbs){
            result.append(sb.toString());
        }
        return result.toString();
    }
}
//given String is PAYPALISHIRING
//P   A   H   N
//A P L S I I G
//Y   I   R
// OUTPUT = PAHN APLSIIG YIR


// you need to find the pattern