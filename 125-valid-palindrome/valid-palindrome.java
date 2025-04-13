class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
        StringBuilder reversed = new StringBuilder(s).reverse(); 
        
        return s.equals(reversed.toString()); 
    }
}
//