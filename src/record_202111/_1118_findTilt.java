package record_202111;

/**
 * https://leetcode-cn.com/problems/binary-tree-tilt/
 * 563. 二叉树的坡度
 */
public class _1118_findTilt {
    int ans;
    public int findTilt(TreeNode root) {
        dfs(root);
        return ans;
    }

    private int dfs(TreeNode root) {
        if(root==null) return 0;
        int left=dfs(root.left);
        int right=dfs(root.right);
        ans+=Math.abs(left-right);
        return left+right+root.val;

    }

}

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
