package record_202109;

/**
 * 找到需要补充粉笔的学生编号
 * https://leetcode-cn.com/problems/find-the-student-that-will-replace-the-chalk/
 */
public class _0910_chalkReplacer {

    public static int chalkReplacer(int[] chalk, int k) {
        int sum=0;
        for(int i=0;i<chalk.length;i++){
            sum+=chalk[i];
            //如果chalk过长，无需进行二次遍历
            k-=chalk[i];
            if(k<0) return i;
        }
        k=k%sum;
        for(int i=0;i<chalk.length;i++){
            if(chalk[i]>k){
                return i;
            }
            k-=chalk[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] chalk=new int[]{3,4,1,2};
        int k=25;
        System.out.println(chalkReplacer(chalk,k));

    }
}
