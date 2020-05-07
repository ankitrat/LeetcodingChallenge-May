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
 
 /*
 Used Traditional approach (By Using Queue) to traverse a binary tree , Time Complexity of below pgm is O(n) 
 and space complexity will be O(n+h) where h is no of levels in binary tree
 */
 
class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root.val == x || root.val ==y) {
            return false;
        }
        if(x == y) {
            return true;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int parentX = 0;
        int parentY = 0;
    
        while(!q.isEmpty()) {
            TreeNode temp = q.poll();
            if(temp == null) {
                q.add(null);
                if(parentX == 0 && parentY ==0) {
                    continue;
                } 
                if(parentX == 0 || parentY == 0) {
                    q = null;
                    return false;
                }
                if(parentX != parentY) {
                    return true;
                } else {
                    return false;
                }
            } else {
                if(temp.left!=null) {
                    if(temp.left.val == x) {
                        parentX = temp.val;
                    } else if (temp.left.val == y) {
                        parentY = temp.val;
                    }
                    q.add(temp.left);
                }
                if(temp.right!=null) {
                    if(temp.right.val == x) {
                        parentX = temp.val;
                    } else if (temp.right.val == y) {
                        parentY = temp.val;
                    }
                    q.add(temp.right);
                }
            }    
        }
        return false;
    }
}