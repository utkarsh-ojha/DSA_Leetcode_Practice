package Arrays;

import java.util.Scanner;


public class LeftShiftCharacter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        boolean result = canConvert(A, B);
        System.out.println(result ? "Yes" : "No");
        scanner.close();
    }

    static boolean canConvert(String A, String B) {
        int len = A.length();

        for (int k = 0; k < 26; k++) {
            StringBuilder shiftedA = new StringBuilder();

            for (int i = 0; i < len; i++) {
                char shiftedChar = (char) ((A.charAt(i) - k < 'a') ? (A.charAt(i) - k + 26) : (A.charAt(i) - k));

                shiftedA.append(shiftedChar);
            }

            if (shiftedA.toString().equals(B)) {
                return true;
            }
        }

        return false;
    }
}
