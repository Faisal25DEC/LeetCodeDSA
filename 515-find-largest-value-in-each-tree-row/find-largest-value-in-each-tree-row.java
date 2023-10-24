/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        if(root == null)return new LinkedList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        List<Integer> ans = new LinkedList<>();
 
        while(!q.isEmpty()){
          
            int sz = q.size();
            int maxNode = Integer.MIN_VALUE;
            while(sz-->0){
                TreeNode front = q.peek();
                if(front.left!=null){
                    q.offer(front.left);
                }
                if(front.right!=null){
                    q.offer(front.right);
                }
                maxNode = Math.max(maxNode, front.val);
                q.poll();
            }
            ans.add(maxNode);
        }   
        return ans;
    }
}