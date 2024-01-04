class Solution {
public:
   int minOperations(vector<int> &nums)
{
    unordered_map<int, int> hm;
    for (int ele : nums)
    {
        hm[ele]++;
    }

    int op = 0;
    for (auto &[k, v] : hm)
    {

        if(hm[k]>=3){
            if(hm[k]%3 == 0)op+=hm[k]/3;
            else{
                op+=hm[k]/3 + 1;
            }
            
        }
        else if(hm[k] == 2)op++;

        else
            return -1;
    }
    return op;
}
};