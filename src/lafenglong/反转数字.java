package lafenglong;

/**
 * Create by chenlong on 2023/9/30 20:55
 */
public class 反转数字 {

    public static void main(String[] args) {
        int x = -1234;
        int reverse = reverse(x);
        System.out.println(reverse);
    }
    public static int reverse (int x) {
        // write code here
        //首先判断是否是负数
        int sum = 0;
        while(x != 0) {
            int tmp = x % 10;
            sum = sum * 10 + tmp;
            x = x / 10;
        }

        return sum;
    }
}
