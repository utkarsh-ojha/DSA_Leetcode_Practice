package Sorting;

/*
Leetcode Link :
https://leetcode.com/problems/sorting-the-sentence/description/
 */
public class SortSentence {
    public String sortSentence(String s) {
        String[] arr = s.split(" ");
        int currentPosition = 0;
        int i = 0;
        while (currentPosition < arr.length && i < arr.length) {
            int currentStringActualPosition = Character.getNumericValue(arr[i].charAt(arr[i].length() - 1)) - 1;
            if (i == currentStringActualPosition) i++;
            else {
                String temp = arr[i];
                arr[i] = arr[currentStringActualPosition];
                arr[currentStringActualPosition] = temp;
                //arr[currentStringActualPosition] =
            }
        }
        for (int j = 0; j < arr.length; j++) {
            String trimString = arr[j].substring(0, arr[j].length() - 1);
            arr[j] = trimString;
        }
        return String.join(" ", arr);
    }
}
