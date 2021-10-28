package record_202110;

/**
 * https://leetcode-cn.com/problems/reordered-power-of-2/
 * 重新排序得到 2 的幂
 */
public class _1028_reorderedPowerOf2 {
    public static boolean reorderedPowerOf2(int n) {
        int[] nums=new int[30];
        for(int i=0;i<30;i++){
            nums[i]= (int) Math.pow(2,i);
        }
        int[] bits=new int[10];
        int m=n;
        while(m!=0){
            int bit=m%10;
            m=m/10;
            bits[bit]++;
        }
        for(int i=0;i<30;i++){
            if(String.valueOf(n).length()==String.valueOf(nums[i]).length()){
                if(powerOf2(bits,nums[i])){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean powerOf2(int[] num,int m) {
        int[] bits=num.clone();
        while(m!=0){
            int bit=m%10;
            bits[bit]--;
            m=m/10;
        }
        for(int bit:bits){
            if(bit!=0)return false;
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println(reorderedPowerOf2(46));;


    }
}
