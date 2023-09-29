package lafenglong.jiuzhang;

import java.util.*;

public class LargestNumber {

    List<Integer> list = Arrays.asList(2, 1, 6, 9, 3, 4);

    //O(N)的空间复杂度
    public static List<Integer> largestNumber(List<Integer> list) {
        if (list.isEmpty()) {
            return list;
        }
        //借助一个new 的list来做
        List<Integer> newList = new ArrayList<>();
        newList.add(list.get(0));
        for(Integer i : list) {
            if(newList.get(newList.size() - 1) < i) {
                newList.add(i);
            }
        }
        return newList;
    }

    //O（1）的空间复杂度
    public static List<Integer> largestNumber1(List<Integer> list) {
        if (list.isEmpty()) {
            return list;
        }
        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()) {
            Integer next = iterator.next();
        }
        ListIterator<Integer> integerListIterator = list.listIterator();

        return list;
    }

    public static void main(String[] args) {
        char c = '1';
        System.out.println((int)c - 48);
    }
}
