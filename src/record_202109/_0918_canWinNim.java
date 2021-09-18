package record_202109;

/**
 * Nim 游戏
 * https://leetcode-cn.com/problems/nim-game/
 */
public class _0918_canWinNim {
    public static boolean canWinNim(int n) {

        return n%4!=0;
    }
    public static void main(String[] args) {
        System.out.println(canWinNim(8));
    }
}
