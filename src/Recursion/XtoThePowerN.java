package Recursion;
/*
Leetcode Link : https://leetcode.com/problems/powx-n/description/
 */
public class XtoThePowerN {
    public static void main(String[] args) {
        myPow(2, 4);
    }

    public static double myPow(double x, int n) {
        if (n == 0) return 1;
        double ans = myPow(x, n / 2);
        if (n % 2 == 0) {
            return ans * ans;
        } else {
            if (n > 0) {
                return x * ans * ans;
            } else {
                return (1 / x) * ans * ans;
            }
        }
    }

//    public double myPow(double x, int n) {
//        if (n > 0) {
//            if (n == 1) return x;
//            return x * myPow(x, n - 1);
//        } else {
//            if (n == -1) return 1 / x;
//            return 1 / (x * myPow(x, -(n) - 1));
//        }
}
