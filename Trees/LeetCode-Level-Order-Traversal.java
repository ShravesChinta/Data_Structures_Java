

/**

102. Binary Tree Level Order Traversal

Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).


Example 1:

Input: root = [3,9,20,null,null,15,7]
Output: [[3],[9,20],[15,7]]
Example 2:

Input: root = [1]
Output: [[1]]
Example 3:

Input: root = []
Output: []


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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> a=new ArrayList<>();
        int level=0;
        Queue<TreeNode> q =new LinkedList<>();
        if(root==null)
            return a;
        
        q.add(root);
        while(q.size()>0)
        {
            int l = q.size();
            a.add(level, new ArrayList<>());
            while(l>0)
            {
                TreeNode ele=q.remove();
                a.get(level).add(ele.val);
                    if(ele.left!=null)
                        q.add(ele.left);
                    if(ele.right!=null)
                        q.add(ele.right);
                l--;
            }
            level++;
        }
        
        return a;
    }
}
