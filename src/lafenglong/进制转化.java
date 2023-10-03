package lafenglong;

/**
 * Create by chenlong on 2023/10/1 10:28
 */
public class 进制转化 {

    public static void main(String[] args) {
        int M = 10;
        int N = 16;
        String solve = solve(M, N);
        System.out.println(solve);
    }
    public static String solve (int M, int N) {
        // write code here
        StringBuffer sb = new StringBuffer();
        while(M != 0) {
            int tmp = M % N;
            if(tmp == 10) {
                sb.append("A");
            }else if(tmp == 11) {
                sb.append("B");
            }else if(tmp == 12) {
                sb.append("C");
            }else if(tmp == 13) {
                sb.append("D");
            }else if(tmp == 14) {
                sb.append("E");
            }else if(tmp == 15) {
                sb.append("F");
            }else {
                sb.append(tmp);
            }

            M = M / N;
        }
        String s = sb.toString();
        char[] chars = s.toCharArray();
        StringBuffer sb1 = new StringBuffer();
        for(int i = chars.length - 1; i >=0; i--) {
            sb1.append(chars[i]);
        }
        return sb1.toString();
    }
}
