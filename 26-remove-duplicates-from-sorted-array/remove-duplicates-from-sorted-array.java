public class Main {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] nums = {1, 1, 2, 2, 3};
        int length = s1.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + length);
        System.out.print("New array: ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 0;  // Pointer to place next unique number
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[k]) {
                k++;
                nums[k] = nums[j];
            }
        }
        return k + 1; // New length
    }
}
