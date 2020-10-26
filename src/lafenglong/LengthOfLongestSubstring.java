package lafenglong;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "pwwkew";
        int i = lengthOfLongestSubstring(s);

    }

    public static int lengthOfLongestSubstring(String s) {
        int maxLongest = 0;
        int countLongest = 0;
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet();
        //开始暴力解法，双重for循环
        for(int i= 0; i < chars.length; i++)
        {
            set.clear();
            for(int j = i; j < chars.length; j++)
            {
                //只要下一个不在set集合中
                if(!set.contains(chars[j]))
                {
                    set.add(chars[j]);
                    countLongest++;
                    maxLongest = Math.max(countLongest , maxLongest);
                }
                else
                {
                    countLongest = 0;
                    break;
                }
            }
        }
        return maxLongest;
    }


}
