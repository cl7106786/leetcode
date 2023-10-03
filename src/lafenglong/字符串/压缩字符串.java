package lafenglong.字符串;

/**
 * Create by chenlong on 2023/9/30 13:29
 */
public class 压缩字符串 {

    public static void main(String[] args) {
        String str = "assggghhhh";
        System.out.println(compressString(str));
    }
    public static String compressString (String param) {
        // write code here
        if (param == null || param.length() < 2) {
            return param;
        }
        char[] chars = param.toCharArray();
        StringBuffer sb = new StringBuffer();
        int index = 1;
        //每次需要比较的元素
        char c = chars[index];
        //统计c的个数
        int count = 1;
        while (index < chars.length) {
            if (chars[index] == c) {
                count++;

            } else {
                if (count > 1) {
                    sb.append(c).append(count);
                } else {
                    sb.append(c);
                }
                c = chars[index];
                count = 1;
            }
            index++;
            if (index >= chars.length) {
                if (count > 1) {
                    sb.append(c).append(count);
                } else {
                    sb.append(c);
                }
            }
        }

        return sb.toString();
    }
}
