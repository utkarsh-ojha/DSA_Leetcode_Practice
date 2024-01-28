package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
1207. Unique Number of Occurrences
Leetcode Link: https://leetcode.com/problems/unique-number-of-occurrences/description/
*/
public class UniqueOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        int len = arr.length;
        Map<Integer, Integer> outArr = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (!outArr.containsKey(arr[i])) {
                outArr.put(arr[i], 1);
            } else {
                outArr.put(arr[i], (outArr.get(arr[i])) + 1);
            }
        }
        var outSet = new HashSet<Integer>();
        int counter = 0;

        for (var i : outArr.values()) {
            if (outSet.contains(i)) {
                counter++;
            } else
                outSet.add(i);
        }
        return counter == 0;
    }
}

