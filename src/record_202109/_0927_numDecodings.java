package record_202109;

/**
 * 解码方法 II
 * https://leetcode-cn.com/problems/decode-ways-ii/
 */
public class _0927_numDecodings {
    static final int Mod=1000000007;
    public static int numDecodings(String s) {
       int n=s.length();
       long a=0,b=1,c=0;
       for(int i=1;i<=n;i++){
           c=b*check1Digits(s.charAt(i-1))%Mod;
           if(i>1){
               c=(c+a*check2Digits(s.charAt(i-2),s.charAt(i-1)))%Mod;
           }
           a=b;
           b=c;
       }
       return (int)c;
    }
    private static long check1Digits(char ch) {
        if(ch=='0') return 0;
        return ch=='*'?9:1;
    }
    private static long check2Digits(char c0,char c1) {
        if(c0=='*'&&c1=='*'){
            return 15;
        }
        if(c0=='*'){
            return c1<='6'?2:1;
        }
        if(c1=='*'){
            if(c0=='1'){
                return 9;
            }
            if(c0=='2'){
                return 6;
            }
            return 0;
        }
        return (c0!='0'&&(c0-'0')*10+(c1-'0')<=26)?1:0;
    }



    public static void main(String[] args) {
        String s = "2*32*1";
        System.out.println(numDecodings(s));
    }
}
