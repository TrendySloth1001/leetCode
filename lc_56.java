/*
   Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

   type : medium

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.     
 */

import java.util.Arrays;
import java.util.LinkedList;

class Solution {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][0];
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        //merge intervals
        LinkedList<int[]> merged = new LinkedList<>();
        //start with first
        int[] nowInterval = intervals[0];
        merged.add(nowInterval);
        for (int[] interval : intervals) {
            if (interval[0] <= nowInterval[1]) {
                nowInterval[1] = Math.max(nowInterval[1], interval[1]);
            } else {
                nowInterval = interval;
                merged.add(nowInterval);
            }
        }
        return merged.toArray(int[][]::new);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result1 = solution.merge(intervals1);
        System.out.println(Arrays.deepToString(result1)); // Output: [[1, 6], [8, 10], [15, 18]]

        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] result2 = solution.merge(intervals2);
        System.out.println(Arrays.deepToString(result2)); // Output: [[1, 5]]
    }

}
