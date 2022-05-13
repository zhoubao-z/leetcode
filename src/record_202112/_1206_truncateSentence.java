package record_202112;

public class _1206_truncateSentence {

    public String truncateSentence(String s, int k) {
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                cnt++;
            }
            if(cnt==k)
                return s.substring(0,i);
        }
        return s;
    }

    public static void main(String[] args) {

    }
}
