package Recursion;

/*
The Deadly Sin
Meliodas and Ban are fighting over chocolates. Meliodas has
�
X chocolates, while Ban has
�
Y. Whoever has lesser number of chocolates eats as many chocolates as he has from the other's collection. This eatfest war continues till either they have the same number of chocolates, or atleast one of them is left with no chocolates.
Can you help Elizabeth predict the total no of chocolates they'll be left with at the end of their war?

Input Format
First line will contain
�
T, number of testcases. Then the testcases follow.
Each testcase contains of a single line of input, which contains two integers
�
,
�
X,Y, the no of chocolates Meliodas and Ban have, respectively.
Output Format
For each testcase, output in a single line the no of chocolates that remain after Ban and Meliodas stop fighting.

Constraints
1
≤
�
≤
100000
1≤T≤100000
0
≤
�
,
�
≤
1
0
9
0≤X,Y≤10
9

Sample 1:
Input
Output
3
5 3
10 10
4 8
2
20
8
Explanation:
Denoting Meliodas as
�
M, Ban as
�
B.

Testcase 1:
�
M=5,
�
B=3
Ban eates 3 chocolates of Meliodas.
�
M=2,
�
B=3
Meliodas eats 2 chocolates of Ban.
�
M=2,
�
B=1
Ban eates 1 chocolate of Meliodas.
�
M=1,
�
B=1
Since they have the same no of candies, they stop quarreling.
Total candies left: 2

Testcase 2:
�
M=10,
�
B=10
Since both of them had the same candies to begin with, there was no point in fighting.
Total candies left: 20

Testcase 3:
�
M=4,
�
B=8
Meliodas eats 4 chocolates of Ban.
�
M=4,
�
B=4
Since they have the same no of candies, they stop quarreling.
Total candies left: 8
 */
public class SINS {
    public static void main(String[] args) {
        System.out.println(candiesLeftAfterWar(4, 8000, 0));
    }

//    static int candiesLeftAfterWar(int M, int B) {
//        if (M == 0 || B == 0 || M==B) return B + M;
//        if (M > B) M = Math.max(M - B, 0);
//        else B = Math.max(B - M, 0);
//        System.out.println("M :"+ M +" B :"+B);
//        return candiesLeftAfterWar(M, B);
//    }

    //Optimized solution
    static int candiesLeftAfterWar(int M, int B, int result) {
        System.out.println("M :" + M + " ,B:" + B);
        System.out.println("===========");
        System.out.println("result : " + result);
        if (M == 0 || B == 0) return result + M + B;
        if (M > B) {
            System.out.println("result + B : " + result + B);
            return candiesLeftAfterWar(M % B, B, result + B);
        } else {
            System.out.println("result + M : " + result + M);
            return candiesLeftAfterWar(M, B % M, result + M);
        }
    }

    /*
    Tail Recursion Optimization (TRO): You can optimize the recursion by implementing tail recursion.
    In tail recursion, the recursive call is the last thing done by the function before it returns.
    This allows the compiler to optimize the recursive function call into an iterative one, potentially
    saving stack space and improving performance. However, in Java, the language specification does not
     mandate tail call optimization, so the effectiveness of this optimization depends on the compiler.

    Memoization: Memoization is a technique where you store the results of expensive function calls
    and return the cached result when the same inputs occur again. In the context of this problem,
    you can use memoization to cache the results of the recursive calls for different input values of M and B.
    This can significantly reduce redundant computation, especially for large inputs or test cases where the same
    input values occur multiple times.
     */
}

