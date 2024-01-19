//https://leetcode.com/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int compress(char[] chars) {
        int currlength = 0;
        char currchar = chars[0];
        int readindex = 0;
        int writeindex = 0;
        //read char at index, keep reading until char changes
        //write char and length as string into array
        //return index
        while(readindex < chars.length){
            if(chars[readindex]==currchar){
                currlength++;
            }
            else{
                String s = String.valueOf(currlength);
                System.out.println(s.length());
                chars[writeindex++] = currchar;
                if(currlength>1){
                    for(int i = 0;i<s.length();i++){
                        chars[writeindex]=s.charAt(i);
                        writeindex++;
                    }
                }
                currchar = chars[readindex];
                currlength = 1;
            }
            readindex++;
        }
        String s = String.valueOf(currlength);
        chars[writeindex++] = currchar;

        if(currlength>1){
            for(int i = 0;i<s.length();i++){
                chars[writeindex]=s.charAt(i);
                writeindex++;
            }
        }
        return writeindex;
    }
}
