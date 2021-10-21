package record_202110;

/**
 * https://leetcode-cn.com/problems/plus-one/
 */
public class _1021_plusOne {
    public static int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            digits[i]%=10;
            if(digits[i]!=0){
                return digits;
            }
        }
        digits=new int[digits.length+1];
        digits[0]=1;
        return digits;
    }
    public static void main(String[] args) {
        int[] digits=plusOne(new int[]{9,9,9});
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
    }
}
