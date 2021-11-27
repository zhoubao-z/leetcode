package record_202111;

/**
 * https://leetcode-cn.com/problems/search-in-a-binary-search-tree/
 */
public class _1126_searchBST {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null) return null;
        if(root.val==val){
            return root;
        }else if(root.val>val){
            return searchBST(root.left,val);
        }else{
            return searchBST(root.right,val);
        }

    }

    public static void main(String[] args) {

    }

}


