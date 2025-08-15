class Solution {

    public String reverseWords(String s) {

    String[] sentence= s.trim().split("\\s+");
    // trim is use to remove leading and trailing spaces 
    // split is use to cut the string into piecs whenever the regex mateches thts \\s means any whitespace character
    int left = 0, right = sentence.length -1;
    while(left<right){
        String temp = sentence[left];
        sentence[left] = sentence[right];
        sentence[right]=temp;
        left++;
        right--;

    }    
    return String.join(" ",sentence);
    }
}