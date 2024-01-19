//https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(t.length()<s.length())return false;
        if(t.length()==0&&s.length()==0)return true;
        else if(t.length()==0)return false;
        if(s.length()==0)return true;
        int iter = 0;
        for(int i = 0;i<t.length();i++){
            //System.out.println(s.charAt(iter)+" and "+t.charAt(i));
            if(s.charAt(iter)==t.charAt(i)){

                iter++;
            }
            if(iter==s.length())return true;
        }
        return false;
    }
}
