class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int gpt = 0;
        int n = garbage.length;
         int [] li = new int[3];
        for(int i = 0;i<n;i++){
            gpt +=garbage[i].length();
            if(garbage[i].contains("P"))li[1] = i;
            if(garbage[i].contains("G"))li[0] = i;
            if(garbage[i].contains("M"))li[2] = i;

        }
       

        
        int []travelPrefix = new int[n];
        for(int i = 0;i<n;i++){
            if(i == 0)travelPrefix[i] = 0;
            else travelPrefix[i] = travelPrefix[i-1] + travel[i-1];
        }


       return(travelPrefix[li[0]] + travelPrefix[li[1]] + travelPrefix[li[2]] + gpt);
       
        
    }
}