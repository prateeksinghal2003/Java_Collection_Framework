import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of the Queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customized ordering
        //should  not say sorting
        // does not allow null elements
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq.peek());
        System.out.println(pq); // not sorted
        //see the printed pq , only at top/head is what matters that is the smallest element
        //no matter how rest elements are ordered
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        // internal working
        // PriorityQueue is implemented as a min-heap by default (for natural ordering)
        //each node value is less or equal to children
        //so at top/root smallest element stays
        //adding an element --O(logn)
        //removing an element--O(logn)

        //for reverse ordering
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder());

        PriorityQueue<Integer> pq3 = new PriorityQueue<>((x,y)->x-y);//asc order
        PriorityQueue<Integer> pq4 = new PriorityQueue<>((x,y)->y-x);//desc order

    }
}