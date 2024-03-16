package Searching;

public class MySqrt {
    public static void main(String[] args) {
        System.out.println(mySqrt(4958679));
    }

    static int mySqrt(int x) {
        long left = 0;
        long right = x;
        long mid = (right + left) / 2;

        if (x == 0 || x == 1) return x;
        while (left <= right) {
            mid = left + (right - left) / 2;
            long num = mid * mid;
            if (num == x) return (int) mid;
            else if (num > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) right;
    }
}
