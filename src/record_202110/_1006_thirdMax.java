package record_202110;

import java.util.TreeSet;

/**
 * https://leetcode-cn.com/problems/third-maximum-number/
 */
public class _1006_thirdMax {
    public static int thirdMax(int[] nums) {
        TreeSet<Integer> set=new TreeSet<>();
        for(int num:nums){
            set.add(num);
            if(set.size()>3){
                set.remove(set.first());
            }
        }
        return set.size()==3?set.first():set.last();
    }
    public static void main(String[] args) {
        System.out.println(thirdMax(new int[]{2,2,3,1}));
    }
}
