package lafenglong.dynamic;

/**
 * Create by chenlong on 2023/10/1 17:02
 */
public class 杨辉三角 {
    public static void main(String[] args) {
        int[][] generate = generate(5);
        for(int i = 0; i < generate.length; i++) {
            for(int j = 0; j <generate[i].length; j++) {
                System.out.print(generate[i][j] );
            }
            System.out.println();
        }
    }
    public static int[][] generate (int num) {
        // write code here
        int[][] result = new int[num][num];
        for(int i = 0; i < num; i++) {
            result[i][0] = 1;
            for(int j = 1; j <= i; j++) {
                result[i][j] = result[i - 1][j - 1] + result[i - 1][j];
            }
        }
        return result;
    }
}
