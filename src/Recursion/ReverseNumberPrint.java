package Recursion;

public class ReverseNumberPrint {
    public static void main(String[] args) {
        printNumbers(6);
    }

    static void printNumbers(int num) {
        if (num == 0) return;
        System.out.println(num);
        printNumbers(num - 1);
    }

}
