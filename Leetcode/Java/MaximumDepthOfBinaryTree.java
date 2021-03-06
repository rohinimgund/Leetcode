/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 *Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Note: A leaf is a node with no children.

Example:

Given binary tree [3,9,20,null,null,15,7],
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)
        return 0;
 
    int bigger = Math.max(maxDepth(root.left),maxDepth(root.right));
 
    return bigger+1;
        
    }
}