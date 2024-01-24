//https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int largestAltitude(int[] gain) {
        int summit = 0;
        int height = 0;
        for(int alt:gain){
            height+=alt;
            if(height>summit)summit=height;
        }
        return summit;
    }
}
