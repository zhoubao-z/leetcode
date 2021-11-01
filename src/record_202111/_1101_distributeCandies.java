package record_202111;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode-cn.com/problems/distribute-candies/
 * 575. 分糖果
 */
public class _1101_distributeCandies {
    public static int distributeCandies(int[] candyType) {
        Set<Integer> set=new HashSet<>();
        for(int candy:candyType){
            set.add(candy);
            if(set.size()>=candyType.length/2)
                return candyType.length/2;
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] candyType={1,1,2,2,3,3,5,6};
        System.out.println(distributeCandies(candyType));
    }
}
