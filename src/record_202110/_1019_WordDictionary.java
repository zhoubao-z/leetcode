package record_202110;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/design-add-and-search-words-data-structure/
 * 添加与搜索单词 - 数据结构设计
 */
public class _1019_WordDictionary {
    public static void main(String[] args) {
        WordDictionary wordDictionary = new WordDictionary();
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");
        System.out.println(wordDictionary.search("pad"));; // return False
        System.out.println(wordDictionary.search("bad"));; // return True
        System.out.println(wordDictionary.search(".ad"));; // return True
        System.out.println(wordDictionary.search("b.."));; // return True

    }
}

class WordDictionary {
    private Trie root;
    public WordDictionary() {
        root=new Trie();
    }

    public void addWord(String word) {
        root.insert(word);
    }

    public boolean search(String word) {

         return dfs(word,0,root);
    }

    private boolean dfs(String word, int index, Trie node) {
        if(index==word.length()){
            return node.isEnd();
        }
        char ch=word.charAt(index);
        if(Character.isLetter(ch)){
            int childIndex=ch-'a';
            Trie child=node.getChildren()[childIndex];
            if(child!=null&&dfs(word,index+1,child)){
                return true;
            }
        }else{
            for(int i=0;i<26;i++){
                Trie child=node.getChildren()[i];
                if(child!=null&&dfs(word,index+1,child)){
                    return true;
                }
            }
        }
        return false;
    }

}

class Trie{
    private Trie[] children;
    private boolean isEnd;
    public Trie(){
        children=new Trie[26];
        isEnd=false;
    }
    public void insert(String word){
        Trie node=this;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            int index=ch-'a';
            if(node.children[index]==null){
                node.children[index]=new Trie();
            }
            node=node.children[index];
        }
        node.isEnd=true;
    }

    public Trie[] getChildren(){
        return children;
    }
    public boolean isEnd(){
        return isEnd;
    }
}