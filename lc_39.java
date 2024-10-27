/*
   39. Combination Sum      type : medium

  Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the 
frequency
 of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []
 

Constraints:

1 <= candidates.length <= 30
2 <= candidates[i] <= 40
All elements of candidates are distinct.
1 <= target <= 40
 */



import java.util.ArrayList;
import java.util.List;

               class Solution {
    
        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain == 0) {
            result.add(new ArrayList<>(tempList));  
            return;  
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= remain) {  
                tempList.add(candidates[i]); 
                backtrack(result, tempList, candidates, remain - candidates[i], i);  
                tempList.remove(tempList.size() - 1);  
            }
        }
    }
    public static void main(String[] args) {
        // Example 1
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        System.out.println("Example 1 Output: " + combinationSum(candidates1, target1));

        // Example 2
        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        System.out.println("Example 2 Output: " + combinationSum(candidates2, target2));

        // Example 3
        int[] candidates3 = {2};
        int target3 = 1;
        System.out.println("Example 3 Output: " + combinationSum(candidates3, target3));
    }
}

