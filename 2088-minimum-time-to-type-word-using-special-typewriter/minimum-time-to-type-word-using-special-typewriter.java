class Solution {
    public int minTimeToType(String s) {
        int [] arr = new int[26];
        int n = s.length();
        // /** bza -> b->1 z-25 a -> 0  */25-1=>24 or 25-25+1+1
        int time = 0;
        char lastChar = 'a';
        for(int i = 0;i<n;i++){
             char ch = s.charAt(i);
             int temp = Math.min(26- Math.abs(lastChar-ch),Math.abs(ch-lastChar));
             System.out.println(temp);
             time+=temp+1;
             lastChar = ch;
        }
        return time;
    }
}