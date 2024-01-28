package PracticeBasics;

public class Problem2 {
    public static void main(String[] args) {
        int N = 7;
        int targetSum = 6;
        int counter = 0;

        int start = 1;

        while (counter < N) {
            int sum = 0;
            for (int i = start; i > 0; i = i / 10) {
                sum += i % 10;
            }
            if (sum == targetSum) {
                counter++;
                System.out.println(start);
            }
            start++;

        }
    }
}
