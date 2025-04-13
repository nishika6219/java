import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        // Convert all numbers to strings
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        //  sort strings 
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        //handle edge case where all numbers are zero
        if (strNums[0].equals("0")) {
            return "0";
        }

        //combine all the numbers into one big string
        StringBuilder result = new StringBuilder();
        for (String num : strNums) {
            result.append(num);
        }

        return result.toString();
    }
}
//