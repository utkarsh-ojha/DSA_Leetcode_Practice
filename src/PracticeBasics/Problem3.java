package PracticeBasics;

public class Problem3 {
    public static void main(String[] args) {
        int inputNum = -124;
        ifPowOfTwo(inputNum);
    }

    static boolean ifPowOfTwo(int inputNum) {
        if (inputNum <= 0) {
            System.out.println("False");
        }
        while (inputNum % 2 == 0) {
            inputNum /= 2;
        }

        Boolean result = inputNum == 1 ? true : false;
        return result;
    }
}
