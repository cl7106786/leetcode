package lafenglong.huawei.od;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
            Integer leastCount = Integer.MAX_VALUE;
            //先借助hashMap来统计每个字符对应的出现的个数
            Map<Character , Integer> map = new HashMap();
            String input = scanner.nextLine();
            char[] chars = input.toCharArray();
            for(char c : chars)
            {
                map.put(c , map.getOrDefault(c , 0) + 1);
            }

            //找出最小的一个value
            for(Map.Entry<Character, Integer> entry : map.entrySet())
            {
                Integer value = entry.getValue();

                if(value.compareTo(leastCount) < 0)
                {
                    leastCount = value;
                }

            }
            Set<Character> set = new HashSet();
            for(Map.Entry<Character, Integer> entry : map.entrySet())
            {
                Character key = entry.getKey();
                set.add(key);

            }
            StringBuffer sb  = new StringBuffer();
            for(char c : chars)
            {
                if(!set.contains(c))
                {
                    sb.append(c);
                }
            }
            String res = sb.toString();
            if(res.length() == 0)
            {
                System.out.println("empty");
            }
            else
            {
                System.out.println(res);
            }

        }
    }
}
