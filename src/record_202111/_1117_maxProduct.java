package record_202111;

/**
 * https://leetcode-cn.com/problems/maximum-product-of-word-lengths/
 * 318. 最大单词长度乘积
 */
public class _1117_maxProduct {
    public static int maxProduct(String[] words){
        int[] masks=new int[words.length];
        for(int i=0;i<words.length;i++){
            int t=0;
            for(int j=0;j<words[i].length();j++){
                int u=words[i].charAt(j)-'a';
                t|=(1<<u);
            }
            masks[i]=t;
        }
        int ans=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<i;j++){
                if((masks[i]&masks[j])==0){
                    ans=Math.max(ans,words[i].length()*words[j].length());
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words={"abcw","baz","foo","bar","xtfn","abcdef"};
        System.out.println(maxProduct(words));
    }
}
