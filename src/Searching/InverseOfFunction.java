package Searching;

public class InverseOfFunction {
    public static void main(String[] args) {
        System.out.println(func(1234));
        System.out.println(inverseFunc(1370));
    }

    public static int func(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n;
            n /= 10;
        }
        return sum;
    }

    static int inverseFunc(int sum) {
        int left = 0;
        int right = sum;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (func(mid) == sum) {
                return mid;
            } else if (func(mid) > sum) {
                right = mid - 1;
            } else left = mid + 1;
        }
        return -1;
    }

}
