package lafenglong;

import java.util.*;

public class HeapTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        String s = "213";

        Map<Integer ,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet();
        Iterator<Integer> iterator = set.iterator();
        boolean b = iterator.hasNext();
        if(b)
        {
            Integer next = iterator.next();
        }
        for(Map.Entry<Integer , Integer> entry :  map.entrySet())
        {
            if(set.contains(entry.getValue()))
            {
            }
            set.add(entry.getValue());
        }

        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++)
        {
            System.out.println(random.nextInt(list.size()));
        }

    }
}
