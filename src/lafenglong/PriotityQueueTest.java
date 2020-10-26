package lafenglong;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class PriotityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>( 3 ,(i1 , i2) -> Integer.compare(i2 , i1));
        Map<Integer ,Boolean> map = new HashMap<>();
        Set<Map.Entry<Integer, Boolean>> entries = map.entrySet();
    }
}
