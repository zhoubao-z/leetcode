package record_202110;

import java.util.*;

public class _1008_findRepeatedDnaSequences {
    public static List<String> findRepeatedDnaSequences(String s) {
        List<String> result=new ArrayList<>();
        if(s.length()<10){
            return result;
        }
        Set<String> set=new HashSet<>();
        for(int i=0;i<=s.length()-10;i++){
            String arr=s.substring(i,i+10);
            if(set.contains(arr)){
                if(!result.contains(arr)){
                    result.add(arr);
                }
            }else{
                set.add(arr);
            }

        }
        return result;
    }
    public static void main(String[] args) {
        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> result=findRepeatedDnaSequences(s);
        for(String res:result){
            System.out.println(res);
        }
        System.out.println();
    }
}
