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
       

        //travel array prefix sum
        int []tps = new int[n];
        for(int i = 0;i<n;i++){
            if(i == 0)tps[i] = 0;
            else tps[i] = tps[i-1] + travel[i-1];
        }


       return(tps[li[0]] + tps[li[1]] + tps[li[2]] + gpt);
       
        
    }
}