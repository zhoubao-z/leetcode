package record_202109;


/**
 * 用 Rand7() 实现 Rand10()
 * https://leetcode-cn.com/problems/implement-rand10-using-rand7/
 */

public class _0905_rand10 {
    public static int rand7(){

        return (int)(Math.random()*7)+1;
    }
    public static int[] rand10(int n) {
        int[] randNums=new int[n];
        for(int i=0;i<n;i++){
            randNums[i]=rand10();
        }
        return randNums;
    }
    public static int rand10() {
        int row,col,idx;
        do{
            row=rand7();
            col=rand7();
            idx=col+(row-1)*7;
        }while(idx>40);
        return 1+(idx-1)%10;
    }
    public static void main(String[] args) {
        int[] randNums=rand10(3);
        for(int num:randNums){
            System.out.println(num);
        }
    }
}
