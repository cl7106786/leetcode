package lafenglong;

public class DivideSolution {
    public static void main(String[] args) {
        int a  = -2147483648;
        int b = -1;
        System.out.println(a / b);
        int c = Integer.MIN_VALUE;
        System.out.println(c);

        long l = System.currentTimeMillis();
        for(int i = 0; i < Integer.MAX_VALUE; i++)
        {
            System.out.println(i);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1- l);
    }
}
