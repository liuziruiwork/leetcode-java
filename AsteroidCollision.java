//https://leetcode.com/problems/asteroid-collision/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<Integer>();
        for(int asteroid:asteroids){
            if(stack.size()>0&&stack.peek()>0&&asteroid<0){
                while(Math.abs(asteroid)>=stack.peek()){
                    if(asteroid*-1 == stack.peek()){
                        stack.pop();
                        break;
                    }
                    if(stack.peek()<0){
                        stack.add(asteroid);
                        break;
                    }
                    stack.pop();
                    if(stack.size()==0){
                        stack.add(asteroid);
                        break;
                    }
                }
            }
            else stack.add(asteroid);
        }
        int[] ans=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            ans[i]=stack.pop();
        }
        return ans;
    }
}
