class Solution {
    public String removeOuterParentheses(String s) {
        String output= "";
        int count=0;

        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(count > 0)
                 output += ch; // skips 1st (
                count++;
            }

            else{
                count--;
                if(count>0) 
                output += ch;   // skips last )
            }
        }

        return output;
        
    }
}