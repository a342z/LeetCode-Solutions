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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        traverse(res, new ArrayList<>(), root, targetSum);

        return res;

    }

    private void traverse(List<List<Integer>> res, List<Integer> list, TreeNode root, int targetSum) {
        if( root == null ) return;
        list.add(root.val);
        if ( root.left == null && root.right == null ){
            if (targetSum == root.val){
                res.add(new ArrayList<>(list));
            }

        }

        traverse(res, list, root.left, targetSum - root.val);
        traverse(res, list, root.right, targetSum - root.val);
        list.removeLast();

    }
}
