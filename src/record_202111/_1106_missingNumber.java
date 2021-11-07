package record_202111;
/*
https://leetcode-cn.com/problems/missing-number/
268. 丢失的数字
 */
public class _1106_missingNumber {
    public int missingNumber(int[] nums) {
        int[] help=new int[nums.length+1];
        for(int num:nums){
            help[num]=1;
        }
        for(int i=0;i<help.length;i++){
            if(help[i]==0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
