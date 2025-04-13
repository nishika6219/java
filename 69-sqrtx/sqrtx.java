class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;  //  x is 0
        
        int left = 1, right = x;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;  // To avoid overflow
            
            if (square == x) {
                return mid;  // Found the exact square root
            } else if (square < x) {
                left = mid + 1;  // Search for a larger value
            } else {
                right = mid - 1;  // Search for a smaller value
            }
        }
        
        return right;  // The floor value of the square root
    }
}
//