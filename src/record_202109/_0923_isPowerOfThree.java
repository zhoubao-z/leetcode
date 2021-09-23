package record_202109;

/**
 * 3的幂
 * https://leetcode-cn.com/problems/power-of-three/
 */
public class _0923_isPowerOfThree {
    public static boolean isPowerOfThree(int n){
        return n>0&&Math.pow(3,19)%n==0;
    }
    public static void main(String[] args) {
        int n=27;
        System.out.println(isPowerOfThree(n));
//        System.out.println(Math.pow(3,20));
//        System.out.println(Math.pow(2,31)-1);
    }
}
