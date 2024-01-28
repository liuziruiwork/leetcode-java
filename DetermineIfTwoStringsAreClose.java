//https://leetcode.com/problems/determine-if-two-strings-are-close/submissions/1159577698/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())return false;
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        for(int i = 0;i<word1.length();i++){
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            if(map1.containsKey(c1))map1.put(c1,map1.get(c1)+1);
            else map1.put(c1, 1);
            if(map2.containsKey(c2))map2.put(c2,map2.get(c2)+1);
            else map2.put(c2, 1);
        }
        Object[] array1 = map1.values().toArray();
        Object[] array2 = map2.values().toArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i = 0;i<array1.length;i++){
            System.out.println("values: "+array1[i]+" "+array2[i]);
            if((int)array1[i]!=(int)array2[i]){
                System.out.println("values not equal");
                return false;
            }
        }
        array1 = map1.keySet().toArray();
        array2 = map2.keySet().toArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i = 0;i<array1.length;i++){
            System.out.println("keyset: "+array1[i]+" "+array2[i]);
            if(array1[i]!=array2[i])return false;
        }
        return true;
    }
}
