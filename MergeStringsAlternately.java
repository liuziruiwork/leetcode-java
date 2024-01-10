//https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s = "";
        int i = 0;
        while(i<Math.max(word1.length(), word2.length())){
            if(i<word1.length()){
                s+=word1.charAt(i);
            }
            if(i<word2.length()){
                s+=word2.charAt(i);
            }
            i++;
        }
        return s;
    }
}
