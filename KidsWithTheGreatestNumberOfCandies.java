//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> l = new ArrayList<Boolean>();
        System.out.println(max);
        for(int i = 0;i<candies.length;i++)System.out.println(candies[i]);
        for(int i = 0;i<candies.length;i++){
            l.add(candies[i]+extraCandies>=max);
        }
        return l;
    }
}
