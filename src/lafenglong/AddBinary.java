package lafenglong;

import java.util.ArrayList;
import java.util.List;

public class AddBinary {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<>();
        String a = "1010";
        String b = "1011";
        String s = addBinary(a, b);

    }
    public static String addBinary(String a, String b) {
        if(a == null || a.length() == 0) return b;
        if(b == null || b.length() == 0) return a;
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        int carry = 0;
        int length = Math.max(a.length() , b.length());
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i <= length; i++)
        {
            if(aLength >= 0 && bLength >= 0)
            {
                int sum = a.charAt(aLength) - 48 + b.charAt(bLength ) - 48 + carry;
                if(sum == 2)
                {
                    sb.append('0');
                    carry = 1;
                }
                else if(sum == 3)
                {
                    sb.append('1');
                    carry = 1;
                }
                else
                {
                    sb.append(sum);
                }
                aLength--;
                bLength--;
            }
            else if(aLength >= 0)
            {
                int sum = a.charAt(aLength ) - 48 + carry;
                if(sum == 2)
                {
                    sb.append('0');
                    carry = 1;
                }
                else if(sum == 3)
                {
                    sb.append('1');
                    carry = 1;
                }
                else
                {
                    sb.append(sum);
                }
                aLength--;
            }
            else if(bLength >= 0)
            {
                int sum = b.charAt(bLength) - 48 + carry;
                if(sum == 2)
                {
                    sb.append('0');
                    carry = 1;
                }
                else if(sum == 3)
                {
                    sb.append('1');
                    carry = 1;
                }
                else
                {
                    sb.append(sum);
                }
                bLength--;
            }
        }
        if(carry == 1)
        {
            sb.append('1');
        }
        return sb.reverse().toString();
    }
}
