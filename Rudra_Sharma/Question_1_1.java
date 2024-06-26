// Day1 Question1
// Rohan and Raju have a candy where each square has a number. Rohan wants to find out how many ways she can break the bar into a contiguous segment such that:
// 1. The segment length matches Raju's birth month.
// 2. The sum of the numbers in the segment equals Raju's birth day.

import java.util.*;

class Q1 {

    public static int countWays(int[] candy, int day, int month) {
        int count = 0;
        for (int i = 0; i <= candy.length - month; i++) {
            int sum = 0;
            for (int j = i; j < i + month; j++) {
                sum += candy[j];
            }
            if (sum == day) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n, day, month;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        n = scan.nextInt();

        int candy[] = new int[n];
        System.out.print("Enter the integer presenting the square : ");
        for (int i = 0; i < n; i++) {
            candy[i] = scan.nextInt();
        }
        System.out.print("Enter the day: ");
        day = scan.nextInt();
        System.out.print("Enter the month: ");
        month = scan.nextInt();
        System.out.println("Output: " + countWays(candy, day, month));
        scan.close();
    }
}
