package record_202110;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/majority-element-ii/
 */
public class _1022_majorityElement {
    public static List<Integer> majorityElement(int[] nums) {
        int element1 = 0;
        int element2 = 0;
        int vote1 = 0;
        int vote2 = 0;
        for (int num : nums) {
            if (vote1 > 0 && num == element1) {
                vote1++;
            } else if (vote2 > 0 && num == element2) {
                vote2++;
            } else if (vote1 == 0) {
                element1 = num;
                vote1++;
            } else if (vote2 == 0) {
                element2 = num;
                vote2 = 1;
            } else {
                vote1--;
                vote2--;
            }
        }
        int cnt1=0;
        int cnt2=0;
        for(int num:nums){
            if(vote1>0&&num==element1){
                cnt1++;
            }else if(vote2>0&&num==element2){
                cnt2++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        if(vote1>0&&cnt1>nums.length/3){
            ans.add(element1);
        }
        if(vote2>0&&cnt2>nums.length/3){
            ans.add(element2);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> ans=majorityElement(new int[]{1,1,1,3,5,4,6,5,5,5,1,1,5,5});
        for(int num:ans){
            System.out.println(num);
        }
    }
}
