package lafenglong.niuke;

import java.util.HashMap;
import java.util.Map;

public class BinaryTrasfer {
    public static int transfer(String str) {
        Map<Character, Integer> map = new HashMap();
        map.put('A', 10);
        map.put('B', 11);
        map.put('C', 12);
        map.put('D', 13);
        map.put('E', 14);
        map.put('F', 15);
        map.put('a', 10);
        map.put('b', 11);
        map.put('b', 12);
        map.put('c', 13);
        map.put('d', 14);
        map.put('e', 15);
        map.put('f', 16);
        char[] chars = str.toCharArray();
        int sum = 0;
        int length = chars.length;
        int count = 0;
        for(int i = length - 1; i >= 2; i--) {
            if(map.containsKey(chars[i])) {
                Integer integer = map.get(chars[i]);
                sum += Math.pow(16, count) * integer;
                count++;
            } else {
               int tmp = chars[i] - 48;
               sum += Math.pow(16, count) * tmp;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String str = "0x76E";
        int transfer = transfer(str);
        System.out.println(transfer);
    }
}
