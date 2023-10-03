package lafenglong.字符串;

/**
 * Create by chenlong on 2023/9/30 08:43
 */
public class 字符串变形 {
    public static void main(String[] args) {
        String str = "h i ";
        int n = 4;
        String trans = trans(str, 4);

    }
    public static String trans (String s, int n) {
        // write code here
        //1.字符串由空格分割，进行反转；
        //2.对每个字符进行反转大小写,大写变写
        if(s == null || s.length() == 0) {
            return s;
        }
        String[] strs = s.split(" ");
        StringBuffer sb = new StringBuffer();
        for(int i = strs.length - 1; i >= 0; i--) {
            String str = strs[i];
            sb.append(revertString(str));
            if(i != 0) {
                sb.append(" ");
            }

        }
        return sb.toString().trim();
    }
    private static String revertString(String str) {
        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < chars.length; i++) {
            sb.append(revertCharacter(chars[i]));
        }
        return sb.toString();
    }
    private static char revertCharacter(char c) {
        if(c >= 'a' && c <= 'z') {
            int tmp = c - 'a' + 'A';
            return (char)tmp;
        }
        if(c >= 'A' && c <= 'Z') {
            int temp = c - 'A' + 'a';
            return (char)temp;
        }
        return ' ';
    }
}
