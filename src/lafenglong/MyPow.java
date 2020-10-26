package lafenglong;

import java.util.Arrays;

public class MyPow {
    public static void main(String[] args) {
        double res = Math.pow(0 , 0);
        double pow1 = Math.pow(0, 0);
        System.out.println(pow1);
        double pow = Math.pow(2, 0);
        System.out.println(pow);
        double v = myPow(34.00515, -3);
        System.out.println(v);
    }
    public static double myPow(double x, int n) {
        if(n == 1)
        {
            return x;
        }
        if(n == -1)
        {
            return 1 / x;
        }
        //if n是偶数
        if(n % 2 == 0)
        {
            n = n / 2;
            return myPow(x , n) * myPow(x , n);
        }
        else
        {
            n = n / 2;
            return myPow(x , n) * myPow(x , n) * x;
        }
    }
}
