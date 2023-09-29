package lafenglong.huawei.od;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Create by chenlong on 2023/9/21 09:14
 */
public class HJ23删除字符串中出现次数最少的字符 {
    public static void main(String[] args) {
        String str = "aabcddd";
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < chars.length; i++) {
            if(map.containsKey(chars[i])) {
                map.put(chars[i] , map.get(chars[i]) + 1);
            }else {
                map.put(chars[i], 1);
            }
        }
        Collection<Integer> values = map.values();
        //找到values中的最小的值
        Integer minValue = Integer.MAX_VALUE;
        for(Integer i : values) {
            if(i.compareTo(minValue) < 0) {
                minValue = i;
            }
        }
        System.out.println(minValue);
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < chars.length; i++) {
            if(!map.get(chars[i]).equals(minValue)) {
                sb.append(chars[i]);
            }
        }
        System.out.println(sb.toString());
    }

}
