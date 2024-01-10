//https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public String reverseVowels(String s) {
        Stack<Character> vowels = new Stack<Character>();
        for(int i = 0;i<s.length();i++){
            if(isVowel(s.charAt(i)))vowels.push(s.charAt(i));
        }
        for(int i = 0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                s = s.substring(0,i)+vowels.pop()+s.substring(i+1);
            }
        }
        return s;
    }
    public boolean isVowel(char c){
        return c =='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}
