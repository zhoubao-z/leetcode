package record_202110;

public class _1018_findComplement {
    public static int findComplement(int num) {
        String ans=Integer.toBinaryString(num);
        StringBuffer buf=new StringBuffer();
        for(int i=0;i<ans.length();i++){
            buf.append(ans.charAt(i)=='0'?1:0);
        }
        return Integer.parseInt(buf.toString(),2);
    }

    public static void main(String[] args) {
        System.out.println(findComplement(1));
    }
}
