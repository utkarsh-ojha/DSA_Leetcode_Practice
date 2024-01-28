package Arrays;

import java.util.ArrayList;
import java.util.List;

/*
1431. Kids With the Greatest Number of Candies
Leetcode Link: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
 */
public class KidsWithCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int len = candies.length;
        List<Boolean> output = new ArrayList<>(len);
        int max = candies[0];
        for (int i = 1; i < len; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < len; i++) {
            if (candies[i] + extraCandies >= max) {
                output.add(true);
            } else output.add(false);
        }

        return output;
    }
}
