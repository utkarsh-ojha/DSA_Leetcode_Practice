package DayWise.Day4;


//Leetcode link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//
//
//Example 1:
//
//Input: haystack = "sadbutsad", needle = "sad"
//Output: 0
//Explanation: "sad" occurs at index 0 and 6.
//The first occurrence is at index 0, so we return 0.
//Example 2:
//
//Input: haystack = "leetcode", needle = "leeto"
//Output: -1
//Explanation: "leeto" did not occur in "leetcode", so we return -1.
//
//
//Constraints:
//
//        1 <= haystack.length, needle.length <= 104
//haystack and needle consist of only lowercase English characters.
public class Problem1 {

    public static void main(String[] args) {
        int output = strStr("abc", "c");
        System.out.println(output);
    }

    public static int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int needLength = needle.length();

        if(haystack.equals(needle)){
            return 0;
        }

        for(int i = 0 ; i<hayLength-needLength+1; i++)
        {
            String partString = haystack.substring(i,i+needLength);
            if(partString.equals(needle)){
                return i;
            }
        }
        return -1;

    }
}
