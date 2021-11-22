package record_202111;

import java.util.List;

/**
 * https://leetcode-cn.com/problems/maximum-depth-of-n-ary-tree/
 */
public class _1121_maxDepth {

    public int maxDepth(Node root) {
        if(root==null) return 0;
        int ans=0;
        for(Node node:root.children){
            ans=Math.max(ans,maxDepth(node));
        }
        return ans+1;
    }
}

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
