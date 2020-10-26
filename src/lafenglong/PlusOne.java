package lafenglong;

public class PlusOne {
    public static void main(String[] args) {
        int []s = new int[] {9,8,7,6,5,4,3,2,1,0};
        int[] ints = plusOne(s);
    }

    public static int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0) return new int[]{};

        //先计算出这个整数数组的值
        int sum = 0;
        for(int i = 0 ; i < digits.length; i++)
        {
            sum = sum * 10 + digits[i];
        }
        //最后的整数
        sum = ++sum;
        int newResult = sum;
        //如果是99这样的数，加1之后，要多一位
        //也就是说如果sum = 10 ，100 ，1000
        StringBuffer sb = new StringBuffer();
        while(sum != 0)
        {
            int unit = sum % 10;
            sb.append(unit);
            sum = sum / 10;
        }
        int length = sb.toString().length();
        int[] result = new int[length];
        int i = length;
        while(newResult != 0)
        {
            int unit = newResult % 10;
            result[--i] = unit;
            newResult = newResult / 10;
        }

        return result;
    }
}
