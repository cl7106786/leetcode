package lafenglong.huawei.od;

import java.util.HashSet;
import java.util.Set;

/**
 * Create by chenlong on 2023/9/20 10:35
 */
public class 提取不重复的整数 {
    public static void main(String[] args) {
        int a = 9876673;
        int result = 0;
        Set<Integer> set = new HashSet<>();
        while(a != 0) {
            int b = a % 10;
            a = a / 10;
            System.out.println(b);

            if(!set.contains(b)) {
                result = result * 10 + b;
                set.add(b);
            }

        }
        System.out.println(result);
    }
}
