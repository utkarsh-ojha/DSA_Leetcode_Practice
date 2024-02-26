package Recursion;

public class Pelindrome {
    static char[] sidha;
    static char[] ulta;

    public static void main(String[] args) {
        System.out.println(isPalindrome("apapa"));
    }

    static int isPalindrome(String S) {
        sidha = S.toCharArray();
        ulta = S.toCharArray();
        help(sidha, 0);

        for (int i = 0; i < sidha.length; i++) {
            if (sidha[i] != ulta[i]) return 0;
        }
        return 1;
    }

    static void help(char[] input, int counter) {
        int len = input.length;
        if (counter >= len / 2) {
            return;
        } else if (counter < len / 2) {
            char temp = input[counter];
            input[counter] = input[len - 1 - counter];
            input[len - 1 - counter] = temp;
            help(input, counter + 1);
        }
    }
}
