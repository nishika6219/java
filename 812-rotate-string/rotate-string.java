class Solution {
    public boolean rotateString(String s, String goal) {
        
        if (s.length()!=goal.length())
        return false;// if length differ then they can never match
        
        String doubled = s+s;//all posible rotstion
        return doubled.contains(goal);


    }
}