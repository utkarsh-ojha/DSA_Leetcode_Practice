package Searching;

public class MySqrt2 {
    public static void main(String[] args) {
        System.out.println(mySqrt(8, 2));
    }

    static double mySqrt(int x, int p) {
        double left = 0;
        double right = x;
        double mid = (right + left) / 2;

        if (x == 0 || x == 1) return x;
        double precision = Math.pow(10, -p);
        while (right - left >= precision) {
            mid = left + (right - left) / 2;
            double num = mid * mid;
            if (num == x) return (int) mid;
            else if (num > x) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return mid;
    }
}
