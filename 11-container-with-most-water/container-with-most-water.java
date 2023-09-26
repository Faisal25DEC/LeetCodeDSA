class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int i = 0,j = n-1;
    int maxA = Integer.MIN_VALUE;
        while(i<j){
            if(height[i]<height[j]){
                maxA = Math.max(maxA, (j-i)*height[i]);
                i++;
            }
            else{
                maxA = Math.max(maxA, (j-i)*height[j]);
                j--;
            }
        }
        return maxA;
        
    }
}