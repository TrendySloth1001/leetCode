//179. Largest Number   type : medium

import java.util.Arrays;

class Solution {

    public String largestNumber(int[] nums) {
        String strNums[] = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNums, (String a, String b) -> {
            // Compare based on which concatenation gives a larger number
            String order1 = a + b;
            String order2 = b + a;
            return order2.compareTo(order1);  // Sort in descending order
        });
        if (strNums[0].equals("0")) {
            return "0";
        }
        StringBuilder largestNumber = new StringBuilder();
        for (String num : strNums) {
            largestNumber.append(num);
        }
        return largestNumber.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {10, 2};
        System.out.println(sol.largestNumber(nums1));

        int[] nums2 = {3, 30, 34, 5, 9};
        System.out.println(sol.largestNumber(nums2));
    }
}
