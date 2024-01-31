package Arrays;

/*
Leetcode Link: https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/
 */
public class FinalValueAfterOperations {
    public int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                ans++;
            }
            if (operations[i].equals("--X") || operations[i].equals("X--")) {
                ans--;
            }
        }
        return ans;
    }
}
