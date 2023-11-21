class Solution {
public:
    long long interchangeableRectangles(vector<vector<int>>& rectangles) {
        unordered_map<double,int> m;
        int n = rectangles.size();
        long long count = 0;
        for(int i = 0;i<n;i++){
            count += m[(1.0*(rectangles[i][0]))/rectangles[i][1]]++;
        }
        return count;

    }
};