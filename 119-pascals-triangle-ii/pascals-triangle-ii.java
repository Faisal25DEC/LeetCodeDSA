class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer [] arr = new Integer[rowIndex+1];
        arr[0] = 1;
        for(int i = 1;i<=rowIndex;i++){
            arr[i] = 0;
            for(int j = i;j>0;j--){
                arr[j] = arr[j] + arr[j-1];
            }
        }
        return Arrays.asList(arr);
        
    }
}