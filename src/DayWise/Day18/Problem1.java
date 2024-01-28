package DayWise.Day18;

public class Problem1 {

    public static void main(String[] args) {
        int input = 7;
        isHappy(input);

    }

    public static boolean isHappy(int n) {
        int temp = n;
        while (temp != 1 && temp > 3) {
            temp = calculateSum(temp);
        }
        if (temp == 1)
            return true;
        else return false;
    }

    static int calculateSum(int tempNum) {
        int sum = 0;
        while (tempNum > 0) {
            sum = sum + (tempNum % 10) * (tempNum % 10);
            tempNum = tempNum / 10;
        }
        return sum;
    }

}
