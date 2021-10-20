package record_202110;

/**
 * https://leetcode-cn.com/problems/kth-smallest-element-in-a-bst/
 */
public class _1017_kthSmallest {
    int i=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        traverse(root,k);
        return ans;
    }

    private void traverse(TreeNode root, int k) {
        if(root==null){
            return;
        }
        traverse(root.left,k);
        i++;
        if(i==k){
            ans=root.val;
            return;
        }
        traverse(root.right,k);
        return;
    }

    public static void main(String[] args) {

    }
}

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
