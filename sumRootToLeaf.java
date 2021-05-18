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
    int res;
    public int sumNumbers(TreeNode root) {
        int currentSum = 0;
        //int res = 0;
        recursive(root, 0);
        return res;
    }
    
    private void recursive(TreeNode root, int currentSum){
        if(root == null) return;
        
        //check whether this is the leaf node
        if(root.left == null && root.right == null){
            res += currentSum * 10 + root.val;
        }
        
        //update the current Sum
        currentSum = currentSum * 10 + root.val;
        
        //left recursive call
        recursive(root.left, currentSum);
        
        //right recursive call
        recursive(root.right, currentSum);
    }
}
