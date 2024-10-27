/**
 217. Contains Duplicate
Easy

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true

 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */

import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        Solution soln = new Solution();
        int nums_1[] = {1, 2, 3, 1};
        System.out.println("case 1 : "+ soln.containsDuplicate(nums_1));
        int nums_2[] = {1,2,3,4};
        System.out.println("case 2 : "+ soln.containsDuplicate(nums_2));
        int nums_3[] = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("case : 3 "+soln.containsDuplicate(nums_3));
    }
}