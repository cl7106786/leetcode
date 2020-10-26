package lafenglong;

public class BinarySearchTest {

    public static void main(String[] args) {
        int i = Integer.MAX_VALUE - 2;
        int j = Integer.MAX_VALUE;
        int sum = i + j;

        System.out.println(sum);
        int result = (i + j) / 2;
        System.out.println(result);

        int s = i + (j - i) /2;

        int s1 = (i + j) >>> 2;
        System.out.println("=======================");
        System.out.println(s1);
    }
}
