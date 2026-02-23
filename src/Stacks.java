import java.util.Stack;

public class Stacks
{
    public static  void main(String[] args)
    {

        //elements can be inserted or removed in between also
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st);

//        System.out.println(st.peek());
//        System.out.println(st.pop());


        //size()
        //isEmpty
        //clear
        st.add(2,3);
        System.out.println(st);
        st.set(2,45);
        System.out.println(st);

        System.out.println(st.search(40));
        //it is one base indexing , starting from top



    }
}
