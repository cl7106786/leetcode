package lafenglong;

import java.util.*;

public class RandomizedCollection {

    //用一个大的数组来存，所有插入的元素
    //map来存元素的对应的数组下标
    Map<Integer , Set<Integer>> map ;
    List<Integer> list;
    /** Initialize your data structure here. */
    public RandomizedCollection() {
        map = new HashMap();
        list = new ArrayList();
    }

    /** Inserts a value to the collection. Returns true if the collection did not already contain the specified element. */
    public boolean insert(int val) {
        //插入的时候，先判断存不存在
        //如果存在，插入之后，返回false
        //如果不存在，插入之后，返回true
        if(map.containsKey(val))
        {
            boolean flag = list.add(val);
            //list的size就是新插入元素的index
            int size = list.size();
            Set<Integer> set = map.get(val);
            set.add(size - 1);
            return false;
        }
        else
        {
            boolean flag = list.add(val);
            //list的size就是新插入元素的index
            int size = list.size();
            Set<Integer> set = new HashSet();
            set.add(size - 1);
            map.put(val , set);
            return true;
        }
    }

    /** Removes a value from the collection. Returns true if the collection contained the specified element. */
    public boolean remove(int val) {
        //找出val是否存在这个元素
        if(map.containsKey(val))
        {
            Set<Integer> set = map.get(val);
            //在set中随机找到一个元素的下表
            Iterator<Integer> iterator = set.iterator();
            if(iterator.hasNext())
            {
                int next = iterator.next();
                list.remove(next);
                set.remove(next);
                if(set.size() == 0)
                {
                    set = null;
                }
            }
            return true;
        }
        else
        {
            return false;
        }


    }

    /** Get a random element from the collection. */
    public int getRandom() {

        return list.get((int)(Math.random() * list.size()));
    }

    public static void main(String[] args) {
        //["RandomizedCollection","insert","insert","remove","insert","remove","getRandom"]
        //[[],[0],[1],[0],[2],[1],[]]

        RandomizedCollection randomizedCollection = new RandomizedCollection();
        System.out.println(randomizedCollection.insert(0));
        System.out.println(randomizedCollection.insert(1));
        System.out.println(randomizedCollection.remove(0));
        System.out.println(randomizedCollection.insert(2));
        System.out.println(randomizedCollection.remove(1));
        System.out.println(randomizedCollection.getRandom());
    }
}
