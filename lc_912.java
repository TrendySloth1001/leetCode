/*
 
   912. Sort an Array
    type   :Medium

Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

 

Example 1:

Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
Example 2:

Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessairly unique.
 

Constraints:

1 <= nums.length <= 5 * 104
-5 * 104 <= nums[i] <= 5 * 104

 */

class Solution {
    public int[] sortArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    
    private void mergeSort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(nums, left, mid); 
            mergeSort(nums, mid + 1, right); 
            merge(nums, left, mid, right); 
        }
    }
    
    private void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        
        while (i <= mid) {
            temp[k++] = nums[i++];
        }
        
        while (j <= right) {
            temp[k++] = nums[j++];
        }
        
        System.arraycopy(temp, 0, nums, left, temp.length);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        int[] nums1 = {5, 2, 3, 1};
        int[] sorted1 = solution.sortArray(nums1);
        System.out.print("Sorted Array 1: ");
        for (int num : sorted1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test case 2
        int[] nums2 = {5, 1, 1, 2, 0, 0};
        int[] sorted2 = solution.sortArray(nums2);
        System.out.print("Sorted Array 2: ");
        for (int num : sorted2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
