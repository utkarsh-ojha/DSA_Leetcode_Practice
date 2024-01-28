package PracticeBasics;

public class Problem6 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n-i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }

        for (int i = n-1; i >0; i--) {
            for (int k = n-i; k >0; k--) {
                System.out.print(" ");
            }
            for (int j = 2*i-1; j >0 ; j--) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
