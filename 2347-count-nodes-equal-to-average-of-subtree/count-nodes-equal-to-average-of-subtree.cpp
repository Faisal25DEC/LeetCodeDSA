/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    pair<int,int> sumOfTree(TreeNode*root){
        if(root == nullptr){
            return {0,0};
        }
       pair<int,int> leftTree = sumOfTree(root->left);
        pair<int,int> rightTree = sumOfTree(root->right);
        pair<int,int> ans;
        ans.first = leftTree.first+rightTree.first+root->val;
        ans.second = leftTree.second+rightTree.second+1;
        return ans;
    }
    int count = 0;
    void subtreeAverage(TreeNode* root) {
        if(root == nullptr)return ;
        pair<int,int> sum = sumOfTree(root);
        int avg = sum.first/sum.second;
        if(avg == root->val){
            count++;
        }
        subtreeAverage(root->left);
        subtreeAverage(root->right);
    }
    int averageOfSubtree(TreeNode*root){
        subtreeAverage(root);
        return count;
    }
};