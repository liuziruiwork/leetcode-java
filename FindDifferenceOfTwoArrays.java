//https://leetcode.com/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for(int i = 0;i<nums1.length;i++){
            h.put(nums1[i],1);
        }
        for(int i = 0;i<nums2.length;i++){
            if(h.get(nums2[i])==null)h.put(nums2[i],2);
            else if(h.get(nums2[i])==1||h.get(nums2[i])==3)h.put(nums2[i],3);
            else h.put(nums2[i],2);
        }
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for(int i:h.keySet()){
            if(h.get(i)==1){
                list1.add(i);
                //System.out.println(i+" added to list 1");
            }
            else if(h.get(i)==2){
                list2.add(i);
                //System.out.println(i+" added to list 2");
            }
            else{
                //System.out.println(i+" is dupe");
            }
        }
        List<List<Integer>> sol = new ArrayList<List<Integer>>();
        sol.add(list1);
        sol.add(list2);
        return sol;
    }
}
