package lafenglong;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueueTest priorityQueueTest = new PriorityQueueTest();
        int[] input = {4,5,1,6,2,7,3,8};
        ArrayList<Integer> integers = priorityQueueTest.GetLeastNumbers_Solution(input, 4);
        System.out.println(integers);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        //最小的k个数，这个可以用快速排序或者堆排序解决
        //这里我们先用堆排序解决(既然是最小的，那我们应该要用大顶堆，也就是最大的比你还要小)
        //Priority默认就是大顶堆
        ArrayList<Integer> res = new ArrayList();
        if(k == 0 || k > input.length) return res;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(k , (o1 , o2) -> Integer.compare(o2 , o1));
        for(int a : input)
        {
            //如果堆空，或者堆内的元素没有到k，然后堆顶的元素比当前元素还要小
//             if(priorityQueue.isEmpty() || priorityQueue.size() < k || priorityQueue.peek() > a)
//             {
//                 priorityQueue.offer(a);
//             }
//             if(priorityQueue.size() > k)
//             {
//                 priorityQueue.poll();
//             }

            if(priorityQueue.size() == k)
            {
                //如果堆顶的比a还要小
                if(priorityQueue.peek() > a)
                {
                    priorityQueue.poll();
                    priorityQueue.offer(a);
                }

            }
            else if(priorityQueue.size() < k)
            {
                priorityQueue.offer(a);
            }

        }
//          while(!priorityQueue.isEmpty())
//          {
//              res.add(priorityQueue.poll());
//          }
        for(Integer integer : priorityQueue)
        {
            res.add(integer);
        }
        return  res;
    }
}
