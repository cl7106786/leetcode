package lafenglong;

public class FindString {

    public static void main(String[] args) {
        String []words = new String[]{"at", "", "", "", "ball", "", "", "car", "", "", "dad", "", ""};
        int ball = findString(words, "ta");
        System.out.println(ball);
    }
    public static int findString(String[] words, String s) {
        //题目中排好序，这是重点，说明已经排好序，那我们就使用二分查找来做
        if(words == null || words.length == 0) return -1;
        int start = 0;
        int end = words.length;
        while(start <= end)
        {
            //算出mid
            int mid = (start + end) / 2 ;
            if(words[mid].compareTo(s) == 0)
            {
                return mid;
            }

            else if(words[mid].compareTo(s) > 0)
            {
                end = mid - 1;
            }
            //在小于s的位置，可能是空字符串
            else if(words[mid].compareTo(s) < 0)
            {
                //如果当前数组的是空字符串
                if(words[mid].equals("") )
                {
                    //那我们就向后找到一个不是空字符串的元素
                    while(words[mid].equals(""))
                    {
                        mid--;
                    }
                    if(words[mid].compareTo(s) > 0)
                    {
                        end = mid - 1;
                    }
                    else if(words[mid].compareTo(s) == 0)
                    {
                        return mid;
                    }
                    else
                    {
                        start = mid + 1;
                    }

                }
                else
                {
                    start = mid + 1;
                }

            }
        }
        return -1;
    }
}
