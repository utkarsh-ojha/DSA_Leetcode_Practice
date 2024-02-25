package Recursion;

public class FabonacciNumber {
    public static void main(String[] args) {
        System.out.println(fabonacci(12));
    }

    static int fabonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return fabonacci(n - 1) + fabonacci(n - 2);
    }
}
