package lafenglong;

import java.util.stream.IntStream;

public class PalindromicAll {
    public static void main(String[] args) {
        IntStream.range(1 , 10000).forEach(i -> {
            if(isPali(i))
            {
                System.out.print(i +" ");
            }
        });
    }

    /**
     * 判断是否回文
     * @param n
     * @return
     */
    private static boolean isPali(int n)
    {
        if(n < 10) return false;
        //1221
        int j = n;
        int sum = 0;
        while(j != 0)
        {
            int i = j % 10;
            sum = sum * 10 + i;
            j = j / 10;
        }
        if(sum == n)
        {
            return  true;
        }
        return  false;
    }
}
