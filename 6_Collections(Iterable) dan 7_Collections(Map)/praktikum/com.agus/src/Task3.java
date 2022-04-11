/*
Problem 3 - Pair with Target Sum
Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.

Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.

Challenges:
Solve with linear complexity O(n), not O(n^2) if you can!
Sample Test Cases
Input: [1, 2, 3, 4, 6], target=6
Output: [1, 3]
Explanation: The numbers at index 1 and 3 add up to 6: 2+4=6

Input: [2, 5, 9, 11], target=11
Output: [0, 2]
Explanation: The numbers at index 0 and 2 add up to 11: 2+9=11
*/

public class Task3 {
    public static void main(String[] args) {
        int[] ke1 = new int[] {1,2,3,4,6};
        pairWithTargetSum(ke1, 1, 3);
        int[] ke2 = new int[] {2,5,9,11};
        pairWithTargetSum(ke2, 0, 2);
    }
    public static void pairWithTargetSum(int[] input, int i, int j) {
        int hasil = input[i]+input[j];
        System.out.println(input[i]+" + "+input[j]+" = "+hasil);
    }
}
