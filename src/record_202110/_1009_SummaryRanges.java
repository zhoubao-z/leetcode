package record_202110;

import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode-cn.com/problems/data-stream-as-disjoint-intervals/
 * 将数据流变为多个不相交区间
 */
public class _1009_SummaryRanges {
    public static void main(String[] args) {
        SummaryRanges summaryRanges = new SummaryRanges();
        summaryRanges.addNum(1);      // arr = [1]
        summaryRanges.getIntervals(); // 返回 [[1, 1]]
        summaryRanges.addNum(3);      // arr = [1, 3]
        summaryRanges.getIntervals(); // 返回 [[1, 1], [3, 3]]
        summaryRanges.addNum(7);      // arr = [1, 3, 7]
        summaryRanges.getIntervals(); // 返回 [[1, 1], [3, 3], [7, 7]]
        summaryRanges.addNum(2);      // arr = [1, 2, 3, 7]
        summaryRanges.getIntervals(); // 返回 [[1, 3], [7, 7]]
        summaryRanges.addNum(6);      // arr = [1, 2, 3, 6, 7]
        summaryRanges.getIntervals(); // 返回 [[1, 3], [6, 7]]

    }
}
class SummaryRanges {
    TreeMap<Integer,Integer> intervals;
    public SummaryRanges() {
            intervals=new TreeMap<>();
    }

    public void addNum(int val) {
        Map.Entry<Integer,Integer> interval1=intervals.ceilingEntry(val+1);
        Map.Entry<Integer,Integer> interval0=intervals.floorEntry(val);

        if(interval0!=null&&interval0.getKey()<=val&&val<=interval0.getValue()){
            return;
        }else{
            boolean leftAside=interval0!=null&&interval0.getValue()+1==val;
            boolean rightAside=interval1!=null&&interval1.getKey()-1==val;
            if(leftAside&&rightAside){
                int left=interval0.getKey(),right=interval1.getValue();
                intervals.remove(interval0.getKey());
                intervals.remove(interval1.getKey());
                intervals.put(left,right);
            }else if(leftAside){
                intervals.put(interval0.getKey(),interval0.getValue()+1);
            }else if(rightAside){
                int right=interval1.getValue();
                intervals.remove(interval1.getKey());
                intervals.put(val,right);
            }else{
                intervals.put(val,val);
            }
        }
    }

    public int[][] getIntervals() {
        int size=intervals.size();
        int[][] ans=new int[size][2];
        int index=0;
        for(Map.Entry<Integer,Integer> entry:intervals.entrySet()){
            int left=entry.getKey(),right=entry.getValue();
            ans[index][0]=left;
            ans[index][1]=right;
            index++;
        }
        return ans;
    }
}
