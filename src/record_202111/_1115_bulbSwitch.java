package record_202111;

public class _1115_bulbSwitch {
    public static int bulbSwitch(int n) {

        return  (int) Math.sqrt(n + 0.5);
    }

    public static void main(String[] args) {
        int cnt=bulbSwitch(10);
        System.out.println(cnt);
    }
}
