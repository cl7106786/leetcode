package lafenglong;

import java.util.LinkedList;

public class StrToInt {
    public static void main(String[] args) {
        int i = strToInt("42");
        System.out.println(i);
        LinkedList<Integer> list = new LinkedList<>();
        list.removeLast();

    }

    public static int strToInt(String str) {
        if(str == null || str.length() == 0) return 0;
        //先去除头尾空字符串；
        str = str.trim();
        if(str.length() == 0) return 0;
        //判断第0个字符是否是+ ， -， 0- 9
        if(!(str.charAt(0) == '+' || str.charAt(0) == '-' || (str.charAt(0) >= '0' && str.charAt(0) <= '9') ))
        {
            return 0;
        }

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) >=0 && str.charAt(i) <=9)
            {
                sb.append(str.charAt(i));
            }
            else
            {
                break;
            }
        }
        try
        {
            int result = Integer.parseInt(sb.toString());
            return result;
        }
        catch(Exception e)
        {
            return Integer.MIN_VALUE;
        }
    }
}
