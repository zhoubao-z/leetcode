package record_202109;

import java.util.*;

class Trie {
    String word;
    Map<Character, Trie> children;

    public Trie() {
        this.word = "";
        this.children = new HashMap<Character, Trie>();
    }

    public void insert(String word) {
        Trie cur = this;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (!cur.children.containsKey(c)) {
                cur.children.put(c, new Trie());
            }
            cur = cur.children.get(c);
        }
        cur.word = word;

    }
}

public class _0916_findWords {
    static int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static List<String> findWords(char[][] board, String[] words) {
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        Set<String> ans = new HashSet<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                dfs(board, trie, i, j, ans);
            }
        }

        return new ArrayList<>(ans);
    }

    public static void dfs(char[][] board, Trie now, int i, int j, Set<String> ans) {
        if (!now.children.containsKey(board[i][j])) {
            return;
        }
        char ch = board[i][j];
        now = now.children.get(ch);
        if (!"".equals(now.word)) {
            ans.add(now.word);
        }
        board[i][j] = '#';
        for (int[] dir : dirs) {
            int newi = i + dir[0];
            int newj = j + dir[1];
            if (newi >= 0 && newi < board.length && newj >= 0 && newj < board[i].length) {
                dfs(board, now, newi, newj, ans);
            }
        }
        board[i][j] = ch;
    }


    public static void main(String[] args) {
        char[][] board = {{'o', 'a', 'a', 'n'}, {'e', 't', 'a', 'e'}, {'i', 'h', 'k', 'r'}, {'i', 'f', 'l', 'v'}};
        String[] words = {"oath", "pea", "eat", "rain"};

        List<String> results = findWords(board, words);
        for (String s : results) {
            System.out.println(s);
        }


    }
}
