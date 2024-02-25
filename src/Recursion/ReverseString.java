package Recursion;
/*
Leetcode link: https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {

    public static void main(String[] args) {
        char[] input = {'h', 'e', 't', 'p'};
        char[] output = reverseString(input);
    }

    static char[] reverseString(char[] s) {
        return helper(s, 0);
    }

    static char[] helper(char[] s, int counter) {
        if (counter < s.length / 2) {
            char temp = s[counter];
            s[counter] = s[s.length - 1 - counter];
            s[s.length - 1 - counter] = temp;
            return helper(s, counter + 1);
        }
        return s;
    }
}
