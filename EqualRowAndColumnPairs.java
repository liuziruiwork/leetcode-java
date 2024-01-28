//https://leetcode.com/problems/equal-row-and-column-pairs/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid[0].length;
        int counter = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(match(grid,i,j,n))counter++;
            }
        }
        return counter;
    }
    public boolean match(int[][] grid, int i, int j, int n){
        int[] array1 = grid[i];
        int[] array2 = new int[n];
        for(int k = 0;k<n;k++){
            array2[k] = grid[k][j];
        }
        return Arrays.equals(array1,array2);
    }
}
