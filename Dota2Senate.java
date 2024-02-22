//https://leetcode.com/problems/dota2-senate/submissions/1182454459/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> radiants = new LinkedList<Integer>();
        Queue<Integer> dires = new LinkedList<Integer>();
        int index = 0;
        for(;index<senate.length();index++){
            if(senate.charAt(index)=='R')radiants.add(index);
            else dires.add(index);
        }
        while(radiants.size()>0&&dires.size()>0){
            int r = radiants.peek();
            int d = dires.peek();
            if(r>d)dires.add(index);
            else radiants.add(index);
            index++;
            radiants.remove();
            dires.remove();
        }
        if(radiants.size()>0)return "Radiant";
        else return "Dire";
    }
}
