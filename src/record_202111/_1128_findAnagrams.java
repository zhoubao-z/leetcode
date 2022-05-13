package record_202111;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 */
public class _1128_findAnagrams {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        if(s.length()<p.length()){
            return ans;
        }
        int[] count=new int[26];
        for(int i=0;i<p.length();i++){
            count[s.charAt(i)-'a']++;
            count[p.charAt(i)-'a']--;
        }
        int diff=0;
        for(int j=0;j<26;j++){
            if(count[j]!=0)
                diff++;
        }
        if(diff==0){
            ans.add(0);
        }
        for(int i=0;i<s.length()-p.length();i++){
            if(count[s.charAt(i)-'a']==1){
                diff--;
            }else if(count[s.charAt(i)-'a']==0){
                diff++;
            }
            --count[s.charAt(i)-'a'];
            if(count[s.charAt(i+p.length())-'a']==-1){
                diff--;
            }else if(count[s.charAt(i+p.length())-'a']==0){
                diff++;
            }
            count[s.charAt(i+p.length())-'a']++;
            if(diff==0){
                ans.add(i+1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        List<Integer> ans=findAnagrams("abcdcba","abc");
        for(int i:ans){
            System.out.println(i);
        }
    }
}
