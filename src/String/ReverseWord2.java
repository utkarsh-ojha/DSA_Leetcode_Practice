package String;

/*
Leetcode link :https://leetcode.com/problems/reverse-string-ii/
 */
public class ReverseWord2 {
    public static void main(String[] args) {
        String input = "abcdefg";
        String output = reverseStr(input, 3);
    }

    public static String reverseStr(String s, int k) {
        char[] tempS = s.toCharArray();
        int len = tempS.length;
        for (int i = 0; i < len; i = i + 2 * k) {
            int currentK = i + k;
            if(currentK > len){
                currentK = len;
            }
            for (int j = i; j < i + k / 2; j++) {
                char temp = tempS[j];
                tempS[j] = tempS[currentK - 1 - (j - i)];
                tempS[currentK - 1 - (j - i)] = temp;
            }
        }
        return String.valueOf(tempS);
    }
}
