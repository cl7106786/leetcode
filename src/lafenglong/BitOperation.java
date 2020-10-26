package lafenglong;

public class BitOperation {
    public static void main(String[] args) {
        int a = 60;
        int b = 13;
        int c = a & b;

        int d = a | b;
        System.out.println("a & b====" + c);

        System.out.println("a | b ====="+ d);
        String s = Integer.toBinaryString(a);

        System.out.println("二进制的a============"+s);

    }
}
