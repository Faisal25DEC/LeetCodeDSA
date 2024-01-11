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
     class min_max{
         public:
         int mn = INT_MAX;
         int mx = INT_MIN;
         min_max(){}
         min_max(int mn,int mx){
             this->mn = mn;
             this->mx = mx;
         }
     };
    int ans = 0;
    min_max maxDiff(TreeNode*root){
        if(root == nullptr){
            min_max m;
            return m;
        }
        min_max leftAns = maxDiff(root->left);
        min_max rightAns = maxDiff(root->right);
        if(root->left && root->right){
            int ansL = max(abs(root->val-leftAns.mn),abs(root->val-leftAns.mx));
            int ansR = max(abs(root->val-rightAns.mn),abs(root->val-rightAns.mx));
            ans = max(ans,max(ansL,ansR));
            min_max ro(min(root->val,min(leftAns.mn,rightAns.mn)),max(root->val,max(leftAns.mx,rightAns.mx)));
            return ro;
        }
        else if(root->left){
            int ansL = max(abs(root->val-leftAns.mn),abs(root->val-leftAns.mx));
            ans = max(ans,ansL);
            min_max ro(min(leftAns.mn,root->val),max(leftAns.mx,root->val));
            return ro;
        }
        else if(root->right){
             int ansR = max(abs(root->val-rightAns.mn),abs(root->val-rightAns.mx));
             ans = max(ans,ansR);
            min_max ro(min(rightAns.mn,root->val),max(rightAns.mx,root->val));
            return ro;
        }
       min_max ro(root->val,root->val);
        return ro;
    }
    int maxAncestorDiff(TreeNode* root) {
        ans = 0;
        if(root == nullptr)return 0;
        maxDiff(root);
        return ans;
    }
};