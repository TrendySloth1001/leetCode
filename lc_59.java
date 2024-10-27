/*
    59. Spiral Matrix II    type medium

Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

Input: n = 3
Output: [[1,2,3],[8,9,4],[7,6,5]]
Example 2:

Input: n = 1
Output: [[1]]
 

Constraints:

[
 [1, 2, 3],
 [8, 9, 4],
 [7, 6, 5]
]


1 <= n <= 20
 */


        class Solution {

    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int num = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1; 

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                mat[top][i] = num++;
            }
            top++; 

            for (int i = top; i <= bottom; i++) {
                mat[i][right] = num++;
            }
            right--; 

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    mat[bottom][i] = num++;
                }
                bottom--; 
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    mat[i][left] = num++;
                }
                left++; 
            }
        }

        return mat;
    }

    public static void main(String[] args) {
        Solution soln = new Solution();

        int n = 3;
        int[][] result = soln.generateMatrix(n);
        System.out.println("Output for n = 3:");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        int n_2 = 1;
        int[][] result_2 = soln.generateMatrix(n_2);
        System.out.println("Output for n = 1:");
        for (int[] row : result_2) {
            for (int num : row) {
                System.out.print(num + " "); 
            }
            System.out.println();
        }
    }
}
