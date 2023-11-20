class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int [] maxRouteLength = new int[1001];

        for(int i = 0;i<trips.length;i++){
            maxRouteLength[trips[i][1]]+=trips[i][0];
            maxRouteLength[trips[i][2]] -=trips[i][0];
        }

        for(int i = 0;i<1001;i++){
            capacity-=maxRouteLength[i];
            if(capacity<0)return false;

        }
        return true;
    }
}