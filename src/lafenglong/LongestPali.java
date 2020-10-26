package lafenglong;

public class LongestPali {
    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        String s = "iopsajhffgvrnyitusobwcxgwlwniqchfnssqttdrnqqcsrigjsxkzcmuoiyxzerakhmexuyeuhjfobrmkoqdljrlojjjysfdslyvckxhuleagmxnzvikfitmkfhevfesnwltekstsueefbrddxrmxokpaxsenwlgytdaexgfwtneurhxvjvpsliepgvspdchmhggybwupiqaqlhjjrildjuewkdxbcpsbjtsevkppvgilrlspejqvzpfeorjmrbdppovvpzxcytscycgwsbnmspihzldjdgilnrlmhaswqaqbecmaocesnpqaotamwofyyfsbmxidowusogmylhlhxftnrmhtnnljjhhcfvywsqimqxqobfsageysonuoagmmviozeouutsiecitrmkypwknorjjiaasxfhsftypspwhvqovmwkjuehujofiabznpipidhfxpoustquzyfurkcgmioxacleqdxgrxbldcuxzgbcazgfismcgmgtjuwchymkzoiqhzaqrtiykdkydgvuaqkllbsactntexcybbjaxlfhyvbxieelstduqzfkoceqzgncvexklahxjnvtyqcjtbfanzgpdmucjlqpiolklmjxnscjcyiybdkgitxnuvtmoypcdldrvalxcxalpwumfx";
        String s1 = longestPalindrome(s);
        System.out.println(s1);
        long l1 = System.currentTimeMillis();
        System.out.println(l1 - l);
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) return s;
        String longStr = "";
        //先暴力求解
        int length = s.length();
        for (int i = 0; i < length -1; i++) {
            for (int j = i; j < length; j++) {
                //稍微做一点剪枝
                if(j - i > longStr.length())
                {
                    String subString = s.substring(i, j + 1);
                    boolean flag = isPalindrome(subString);
                    if (flag) {
                        if (subString.length() > longStr.length()) {
                            longStr = subString;
                        }
                    }
                }

            }
        }
        return longStr;
    }

    private static boolean isPalindrome(String s) {
        if (s == null || s.length() == 1) return true;
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
