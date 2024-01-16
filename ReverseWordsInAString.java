//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public String reverseWords(String s) {
        String[] splited = s.split(" ");
        String flipped = "";
        for(int i = splited.length-1;i>=0;i--){
            //System.out.println("p"+splited[i]+"p");
            if(!splited[i].equals("")){
                flipped+=splited[i]+" ";
            }
        }

        return flipped.substring(0,flipped.length()-1);
    }
}
