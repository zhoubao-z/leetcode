package record_202110;

public class _1014_peakIndexInMountainArray {
    public static int peakIndexInMountainArray(int[] arr){
        int left=0;
        int right=arr.length-1;
        int ans=0;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[mid+1]){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
