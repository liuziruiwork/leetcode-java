//https://leetcode.com/problems/unique-number-of-occurrences/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hash1 = new HashMap<Integer, Integer>();
        for(int i:arr){
            if(hash1.containsKey(i))hash1.put(i, hash1.get(i)+1);
            else hash1.put(i,1);
        }
        HashMap<Integer, Integer> hash2 = new HashMap<Integer, Integer>();
        for(int i:hash1.values()){
            if(hash2.containsKey(i))return false;
            else hash2.put(i,1);
        }
        return true;
    }
}
