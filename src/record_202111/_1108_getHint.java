package record_202111;

import java.util.*;

/**
 * https://leetcode-cn.com/problems/bulls-and-cows/
 * 299. 猜数字游戏
 */
public class _1108_getHint {
    public static String getHint(String secret, String guess) {
        int x=0;
        int y=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i)==guess.charAt(i)){
                x++;
            }else{
                map.put(secret.charAt(i),map.getOrDefault(secret.charAt(i),0)+1);

            }
        }
        for(int i=0;i<guess.length();i++){
            int num=map.getOrDefault(guess.charAt(i),0);
            if(secret.charAt(i)!=guess.charAt(i)&&num>0){
                y++;
                map.put(guess.charAt(i),--num);
            }
        }
        return x+"A"+y+"B";
    }

    public static void main(String[] args) {
        System.out.println(getHint("1123","0111"));
    }
}
