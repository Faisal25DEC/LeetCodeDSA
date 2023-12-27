class Solution {
public:
    int largestSumAfterKNegations(vector<int>& nums, int k) {
        sort(nums.begin(),nums.end());
        int i=0;
        int min=-1;
        int ans=INT_MAX;
        for(int i=0;i<nums.size();i++)
        {
            if(k>0&&nums[i]<0)
            {
                nums[i]=-nums[i];
                k--;
            }
            if(nums[i]<ans)
            {
                ans=nums[i];
                min=i;
            }
        }
        if(k>0)
        {
            if(k%2!=0)
            {
                nums[min]=-nums[min];
            }   
        } 
        int sum=accumulate(nums.begin(),nums.end(),0);  
        return sum;
    }
};