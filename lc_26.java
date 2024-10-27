// leet code problem no.26  type : easy

class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String args[]) {
        Solution soln = new Solution();
        int[] num_1 = {1, 1, 2};
        int length_1 = soln.removeDuplicates(num_1);
        System.out.println("new length = " + length_1);
        //array after modification [1,2] and lenght will be 1 as output 2 
        for (int i = 0; i < length_1; i++) {
            System.out.println(num_1[i] + " ");
        }
        System.out.println("");
        int[] num_2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length_2 = soln.removeDuplicates(num_2);
        System.out.println("new length = " + length_2);
        for (int i = 0; i < length_2; i++) {
            System.out.println(num_2[i] + " ");
        }
    }
}
