class Solution {
     public int lowerBound(int [] arr, int n, int target){
        int lo = 0, hi  = n-1;
        int ans = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]<target){
                lo = mid+1;
                ans = mid;
                
            }else{
                hi = mid-1;
             
            }
        }
    return ans+1;
    }
    public int upperBound(int [] arr, int n, int target){
        int lo = 0, hi  = n-1;
        int ans = -1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]<=target){
                lo = mid+1;
                ans = mid;
                
            }else{
                hi = mid-1;
                
            }
        }
        return ans+1;
    }
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int n = flowers.length;
        int [] startTime = new int[n];
        int [] endTime = new int[n];
        for(int i = 0;i<n;i++){
            startTime[i] = flowers[i][0];
            endTime[i]= flowers[i][1];
           
        }
        Arrays.sort(startTime);
        Arrays.sort(endTime);
        int [] ans = new int[people.length];
        for(int i = 0;i<people.length; i++){
            int up = upperBound(startTime, n, people[i]);
            int lb = lowerBound(endTime, n, people[i]);
            System.out.println(up + " " +lb);
            ans[i] = up-lb;
        }
        return ans;
    }
}