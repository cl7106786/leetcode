package lafenglong;

public class DivideTest {
    public static void main(String[] args) {
        int dividend = -1;
        int divisor = 1;
        int divide = divide(-1, 1);
        System.out.println(divide);
    }
    public static int divide(int dividend, int divisor) {
        //既然不能使用乘法，除法，mod，那我们可以使用加法
        int sum = 0;

        boolean postive = true;
        if(dividend > 0 && divisor < 0) {
            postive = false;
        }
        if(dividend < 0 && divisor > 0) {
            postive = false;
        }


        for(int i = 1; i <= dividend; i++)
        {
            sum += Math.abs(divisor);
            if(sum > Math.abs(dividend))
            {
                if(postive)
                {
                    return i - 1;
                }
                else
                {
                    return -(i - 1);
                }

            }
            else if(sum == Math.abs(dividend))
            {
                if(postive)
                {
                    return i;
                }
                else
                {
                    return -(i);
                }
            }

        }
        return 0;
    }
}
