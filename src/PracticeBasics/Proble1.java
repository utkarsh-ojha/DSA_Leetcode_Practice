package PracticeBasics;

public class Proble1 {
    public static void main(String[] args) {
        int n = 456;
        int target = 7;
        for (int i = 1; i < n; i++) {
            int temp = i;
            int sum = 0;
            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }
            if (sum == target) {
                System.out.println(i);
            }

        }
    }

}
