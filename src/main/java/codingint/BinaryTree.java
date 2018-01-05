package codingint;

/**
 * Created by borisgurtovyy on 11/13/17.
 */

class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class BinaryTree {

    // LEETCODE 104
    public int maxDepth(TreeNode root) {
        if(root== null){
            return 0;
        }
        return 1 + Math.max( maxDepth(root.left)  ,  maxDepth(root.right)  );
    }


    // LEETCODE 100
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }

        return p!=null && q!=null && p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
