//https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int maxVowels(String s, int k) {
        int window = 0;
        for(int i = 0;i<k;i++){
            if(isVowel(s.charAt(i)))window++;
        }
        int max = window;
        for(int i = k;i<s.length();i++){
            if(isVowel(s.charAt(i)))window++;
            if(isVowel(s.charAt(i-k)))window--;
            if(window>max)max=window;
        }
        return max;
    }

    public boolean isVowel(char c){
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
}
