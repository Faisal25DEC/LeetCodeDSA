class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int k = n-1;
        int [] newArr =new int[n];
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                newArr[k--] = nums[i]*nums[i];
                i++;
            }else{
                newArr[k--] = nums[j]*nums[j];
                j--;
            }
        }
        return newArr;
    }
}