class Solution {

    public int check(int [] nums,int [] prefix, int n, int target, int index,int k){
        int s = 0, e = index;
        int res = -1;
        while(s<=e){
            int mid = s + (e-s)/2;
            int newSum = (index-mid+1)*nums[index];
            int prevSum = prefix[index] - prefix[mid] + nums[mid];
            // System.out.println(newSum + " "  + prevSum);
            if(newSum-prevSum<=k){
                res = mid;
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }
        // System.out.println(res);
        return res!=-1?index-res+1:0;
    }
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int n=  nums.length;
        int []prefixSum = new int[n];
        
        for(int i = 0;i<n;i++){
            if(i == 0)prefixSum[i] = nums[i];
            else prefixSum[i] = prefixSum[i-1] + nums[i];
        }

    int maxFreq = 0;
        for(int i = 0;i<n;i++){
         
            maxFreq = Math.max(maxFreq, check(nums, prefixSum, n, nums[i], i, k));
           
        }
        return maxFreq;
    }
}