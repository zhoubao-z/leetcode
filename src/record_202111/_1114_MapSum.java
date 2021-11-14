package record_202111;

import java.util.HashMap;

/**
 * https://leetcode-cn.com/problems/map-sum-pairs/
 * 677. 键值映射
 */
public class _1114_MapSum {


    public static void main(String[] args) {
        MapSum mapSum = new MapSum();
        mapSum.insert("apple",1);
        System.out.println(mapSum.sum("a"));
        mapSum.insert("app",12);
        System.out.println(mapSum.sum("a"));
    }
}

class MapSum {
    class TrieNode {
        int val = 0;
        TrieNode[] next = new TrieNode[26];
    }

    TrieNode root;

    public MapSum() {
        root = new TrieNode();
    }

    public void insert(String key, int val) {
        TrieNode root = this.root;
        for (char c : key.toCharArray()) {
            int index = c - 'a';
            if (root.next[index] == null) {
                root.next[index] = new TrieNode();
            }
            root = root.next[index];
        }
        root.val = val;
    }

    public int sum(String prefix) {
        TrieNode root = this.root;
        for (char c : prefix.toCharArray()) {
            int index = c - 'a';
            if (root.next[index] == null) {
                return 0;
            }
            root = root.next[index];
        }
        return sum(root);
    }

    public int sum(TrieNode node) {
        if (node == null) {
            return 0;

        }
        int sum = node.val == 0 ? 0 : node.val;
        for (int i = 0; i < 26; i++) {
            sum += sum(node.next[i]);
        }
        return sum;
    }

}
