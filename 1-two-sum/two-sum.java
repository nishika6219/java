class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }   
        }
        return new int[]{};
    }
}

public class Main {
    public static void main(String[] args) {
        Solution S = new Solution();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        printResult(S.twoSum(nums1, target1));

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        printResult(S.twoSum(nums2, target2));

        int[] nums3 = {3, 3};
        int target3 = 6;
        printResult(S.twoSum(nums3, target3));
    }

    private static void printResult(int[] result) {
        if (result.length == 2) {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No solution found");
        }
    }
}
