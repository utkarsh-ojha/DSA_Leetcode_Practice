package Recursion;

public class SumIsPelindrome {
    public static void main(String[] args) {
        System.out.println(isDigitSumPalindrome(65));
    }

    static int isDigitSumPalindrome(int N) {
        int num = N;
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        String n = String.valueOf(sum);
        char[] input = n.toCharArray();
        helper(input, 0);
        if (n.equals(new String(input))) return 1;
        else return 0;


    }

    static void helper(char[] input, int counter) {
        int len = input.length;
        if (counter >= len / 2) {
            return;
        } else {
            char temp = input[len - 1 - counter];
            input[len - 1 - counter] = input[counter];
            input[counter] = input[len - 1 - counter];
            helper(input, counter + 1);
        }
    }
}

