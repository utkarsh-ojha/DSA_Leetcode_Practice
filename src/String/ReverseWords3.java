package String;

/*
Leetcode Link :https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWords3 {

    public static void main(String[] args) {
        String input = "I love u";
        String output = reverseWords(input);
    }

    public static String reverseWords(String s) {
        String[] sArr = s.split(" ");
        int len = sArr.length;
        String revWord = "";
        String stemp = "";
        for (int i = 0; i < len; i++) {
            char[] tempSArray = sArr[i].toCharArray();
            if (sArr[i].length() == 1) {
                revWord = sArr[i];
                stemp += revWord + " ";
                continue;
            }
            for (int j = 0; j < sArr[i].length() / 2; j++) {
                char temp = tempSArray[j];
                tempSArray[j] = tempSArray[tempSArray.length - 1 - j];
                tempSArray[sArr[i].length() - 1 - j] = temp;
                revWord = String.valueOf(tempSArray);
            }
            stemp += revWord + " ";
        }
        return stemp.trim();
    }
}
