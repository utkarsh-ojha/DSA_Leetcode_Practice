package DayWise.Day25;

//Leetcode Link: https://leetcode.com/problems/add-digits/
// Additive digital root algorithm
/*
This algorithm aims to find the sum of the digits of a number until a single-digit result is obtained.

Here's how it works:
If the input number num is 0, the function returns 0 since the sum of digits is already 0.

If the input number is divisible by 9 (i.e., num % 9 == 0), then the function returns 9. This is because if a number is
divisible by 9, the sum of its digits is also divisible by 9, and the digital root is 9.

If the above conditions are not met, the function returns num % 9. This is based on the fact that the digital root of a
 number is equivalent to the remainder when the number is divided by 9 (excluding the case where the number is divisible by 9).

This algorithm essentially iteratively adds the digits of the number until a single-digit result is obtained. If the
 number is divisible by 9, the result is 9. The code is designed to handle these specific cases efficiently.

Example:

If num = 38, the sum of its digits is 3 + 8 = 11. The digital root is obtained by further adding 1 + 1, resulting in 2 (a single-digit result).
If num = 45, the sum of its digits is 4 + 5 = 9. The digital root is 9, as the number is divisible by 9.
This algorithm is based on a mathematical property related to the congruence of numbers modulo 9 and the behavior of digital roots.
*/
public class Problem1 {
    public int addDigits(int num) {
        if (num == 0)
            return 0;
        else if (num % 9 == 0)
            return 9;
        else
            return num % 9;
    }
}
