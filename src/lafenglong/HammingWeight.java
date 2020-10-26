package lafenglong;

public class HammingWeight {

    public static void main(String[] args) {
        int n = 00000000000000000000000000001011;
        int i = hammingWeight(n);
        System.out.println(i);
    }
    // you need to treat n as an unsigned value
    public  static int hammingWeight(int n) {
        if(n == 0) return 0;

        String s = n + "";
        int counter = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++)
        {
            if(chars[i] == '1')
            {
                counter++;
            }
        }
        return counter;
    }
}
