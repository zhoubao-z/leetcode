package record_202109;

/**
 *
 */
public class _0904_fib {

    public static int fib(int n) {
        if(n<=1){
            return n;
        }

        int[] num=new int[n+1];
        num[0]=0;num[1]=1;
        int mod=1000000007;
        for(int i=2;i<=n;i++){
            num[i]=(num[i-1]+num[i-2])%mod;
        }
        return num[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(100));
    }
}
