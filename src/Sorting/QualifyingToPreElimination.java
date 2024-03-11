package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class QualifyingToPreElimination {
    public static void main(String[] args) {
        Integer[] input = {3, 5, 2, 4, 5};
        int output = countTeams(input, input.length, 1);
        System.out.println(output);

    }

    static int countTeams(Integer[] inputArray, int lengthOfScoreArray, int tillWhichScoreToQuilify) {
        Arrays.sort(inputArray, Collections.reverseOrder());
        int elementToCompare = inputArray[tillWhichScoreToQuilify - 1];
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] >= elementToCompare) {
                count++;
            }
        }
        return count;
    }
}
