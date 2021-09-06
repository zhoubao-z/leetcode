package record_202109;
/**
 * 二分查找
 * https://leetcode-cn.com/problems/binary-search/
 */
public class _0906_search {
    public static int search(int[] nums, int target) {
        int left=0;int right=nums.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums={-1,0,3,5,9,12};
        System.out.println(search(nums,12));
    }
}
