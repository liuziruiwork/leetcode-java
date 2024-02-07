//https://leetcode.com/problems/removing-stars-from-a-string/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public String removeStars(String s) {
        String nostar = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='*')nostar = nostar.substring(0,nostar.length()-1);
            else nostar+=s.charAt(i);
        }
        return nostar;
    }
}
