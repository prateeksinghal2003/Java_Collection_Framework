import java.util.Arrays;
import java.util.LinkedList;

class Node
{
    int val;

    //reference
    Node next;

    Node(int val)
    {
        this.val=val;
        next=null;

    }
}

public class Linked_List
{


    public static void main(String[] args)
    {
        //it is doubly linked list
        LinkedList<Integer> ll=new LinkedList<>();
        //if we write List<Integer> compiler only allows methods defined inside List interface
        //cannot use methods addFirst, addLast ...
        ll.add(2);
        ll.add(3);
        ll.add(7);
        System.out.println(ll.get(1));

        ll.addLast(10); //0(1)
        ll.addFirst(2);//0(1)
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.removeIf(x->x%2==0);
        System.out.println(ll);

        LinkedList<String> animals=new LinkedList<>(Arrays.asList("cat","dog","pig","horse"));
        LinkedList<String> anim_to_rem=new LinkedList<>(Arrays.asList("pig","horse"));

        System.out.println(animals);
         animals.removeAll(anim_to_rem);
         System.out.println(animals);



    }
}
