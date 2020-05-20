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
    int count;
    public int kthSmallest(TreeNode root, int k) {
        count = 0;
        return kthSmallestElement(root,k);
    }
    
    public int kthSmallestElement(TreeNode root, int k){
        if(root == null) {
            return 0;
        }
        int left = kthSmallestElement(root.left,k);
        if(left!=0) {
            return left;
        }
        count = count+1;
        if(count == k) {
            return root.val;
        }
        return kthSmallestElement(root.right,k);
    }
}