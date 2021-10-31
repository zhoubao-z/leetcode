package record_202110;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/keyboard-row/
 * 500. 键盘行
 */
public class _1031_findWords {
    private static List<Character> row1= new ArrayList<>(Arrays.asList(
            'q','w','e','r','t','y','u','i','o','p'
            ,'Q','W','E','R','T','Y','U','I','O','P'));
    private static List<Character> row2=new ArrayList<>(Arrays.asList(
            'a','s','d','f','g','h','j','k','l',
            'A','S','D','F','G','H','J','K','L'));
    private static List<Character> row3=new ArrayList<>(Arrays.asList(
            'z','x','c','v','b','n','m',
            'Z','X','C','V','B','N','M'));
    private static List<List<Character>> rows=new ArrayList<>(){{add(row1);add(row2);add(row3);}};

    public static String[] findWords(String[] words) {
        List<String> res=new ArrayList<>();
        for(String word:words){
            for(List<Character> row:rows){
                if(singleRow(row,word)){
                    res.add(word);
                }
            }


        }
        return res.toArray(new String[res.size()]);
    }

    private static boolean singleRow(List<Character> row, String word) {
        for(int i=0;i<word.length();i++){
            if(!row.contains(word.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
         String[] words={"Hello","Alaska","Dad","Peace"};
        String[] res=findWords(words);
        for(String s:res){
            System.out.println(s);
        }
    }
}
