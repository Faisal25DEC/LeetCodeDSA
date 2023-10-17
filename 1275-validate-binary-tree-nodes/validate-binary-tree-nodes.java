class Solution {
    public static int countNodes(int [] leftChild, int []rightChild, int root){
        if(root == -1)return 0;

        return 1+countNodes(leftChild, rightChild, leftChild[root]) + countNodes(leftChild, rightChild, rightChild[root]);

    }
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        
        int [] indegree = new int[n];
        for(int i = 0;i<n;i++){
            if(leftChild[i]!=-1 && indegree[leftChild[i]]++==1)return false;
            if(rightChild[i]!=-1 && indegree[rightChild[i]]++==1)return false;
        }
        int root =-1;
        for(int i = 0;i<n;i++){
            if(indegree[i] == 0){
                if(root == -1)root = i;
                else return false;
            }
        }
        return countNodes(leftChild, rightChild,root ) == n?true:false;

    }
}