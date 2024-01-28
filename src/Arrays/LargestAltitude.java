package Arrays;

/*
1732. Find the Highest Altitude
Leetcode Link: https://leetcode.com/problems/find-the-highest-altitude/
 */
public class LargestAltitude {
    public int largestAltitude(int[] gain) {
        int maxAlt = 0;
        int current = 0;
        for (int i = 0; i < gain.length; i++) {
            current += gain[i];
            if (current >= maxAlt) {
                maxAlt = current;
            }
        }
        return maxAlt;
    }
}
