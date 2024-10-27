// leetCode problem 35. Search Insert Position    type: easy

class Solution {
    public int searchInsert(int[] nums, int target) {
       int low = 0;
       int high = nums.length - 1;
       while (low <= high) { 
           int mid = low + (high - low) / 2 ;
           if (nums[mid] == target) {
               return  mid;
           } else if (target < nums[mid]) {
               high = mid - 1;
           } else{
            low = mid + 1;
           }
       }
       return  low;
    }
    public static void main(String[] args) {
        Solution soln = new Solution();
        int[] nums1 = {1, 3, 5, 6};
        System.out.println(soln.searchInsert(nums1, 5)); 
        int[] nums2 = {1, 3, 5, 6};
        System.out.println(soln.searchInsert(nums2, 2)); 
        int[] nums3 = {1, 3, 5, 6};
        System.out.println(soln.searchInsert(nums3, 7)); 
    }
}
