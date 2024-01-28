package PracticeBasics;

public class Problem9 {
    public static void main(String[] args) {
        int n = 6;

        int sum = n*(n-1)/2;
        int mul = 1;

        for (int i = 1; i <=n ; i++) {
            mul *=i;
        }

        if(mul % sum == 0){
            System.out.println("yes");
        }
        else System.out.println("no");

    }
}
