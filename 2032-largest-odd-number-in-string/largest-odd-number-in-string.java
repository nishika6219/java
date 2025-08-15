class Solution {
    public String largestOddNumber(String num) {
        //loop from the last c
        for(int i = num.length()-1; i>=0;i--){
            char ch = num.charAt(i);
            if((ch-'0')%2==1){
                return num.substring(0,i+1);

            }
        }
        return "";
        
    }
}