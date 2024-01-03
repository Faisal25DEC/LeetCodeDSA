class Solution {
public:
    int numberOfBeams(vector<string>& bank) {
        int n=bank.size(); // size of row
        int m=bank[0].size(); // size of column
        int count=0;
        int prev=0,ans=0;
        
        for(int i=0;i<n;i++)
        {
            count=0; // Resetting the count variable
            for(int j=0;j<m;j++)
            {
                if(bank[i][j]=='1')
                    count++;
            }
            
            ans=ans+prev*count; // main logic part
            
            if(count>0)
                prev=count; // when count is non-zero ,we store this in prev 
                
            
        }
        return ans;
    }
};