package lafenglong.字符串;

/**
 * Create by chenlong on 2023/9/30 09:04
 */
public class 旋转字符串 {
    public static void main(String[] args) {
        String A = "youzan";
        String B = "zanyou";
        System.out.println(solve(A, B));
    }
    public static boolean solve (String A, String B) {
        // write code here
        //从中间切割某个位置，不是指最中间
        if(!A.equals(B)) {
            return false;
        }
        int length = A.length();
        for(int i = 0; i < length; i++) {
            String newStr = getNewStr(A, i);
            if(newStr.equals(B)) {
                return true;
            }
        }
        return false;
    }
    private static String getNewStr(String str, int index) {
        return str.substring(index) + str.substring(0, index);
    }
}
