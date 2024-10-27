// leetCode problem no.27  type : easy
class Solution {

    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        Solution soln = new Solution();
        int[] num_1 = {3, 2, 2, 3};
        int length_1 = soln.removeElement(num_1, 3);
        System.out.println("new lenght = " + length_1);
        for (int i = 0; i < length_1; i++) {
            System.out.println(num_1[i] + " ");
        }
        System.out.println(" ");
        int[] num_2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int length_2 = soln.removeElement(num_2, 2);
        System.out.println("new length 2 = " + length_2);
        for (int i = 0; i < length_2; i++) {
            System.out.println(num_2[i] + " ");
        }
    }
}
