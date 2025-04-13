class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        
        for (int i = 0; i < n; i++) {
            //range [1, n]
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                // Swap nums[i] with nums[nums[i] - 1]
                int temp = nums[i];
                nums[i] = nums[nums[i] - 1];
                nums[temp - 1] = temp;
            }
        }

        //Find the first index where the number is not equal to index + 1
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers are in place, the missing number is n + 1
        return n + 1;
    }
}

//