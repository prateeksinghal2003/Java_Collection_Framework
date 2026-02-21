import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_Class
{
    public static void main(String[] args)
    {
        CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();

        //for adding or removal
        //it creates the new list , older list is copied first  and then add or remove
        //after add/remove
        //reference is updated

        //Read operations are fast
        //used when read intensive operations are there
        //while iterating arraylist, cannot modify the arrayList

        //with CopyOnWriteArrayList , can modify it
        //reading and modifying can be done at the same time

        List<String> items=new CopyOnWriteArrayList<>();
        items.add("Milk");
        items.add("Egg");
        items.add("Cream");
        items.add("Bread");

        for(String item:items)
        {
            if(item.equals("Egg"))
             items.add("Butter");

            if(item.equals("Butter"))
                items.add("Cheese");
        }
        System.out.println(items);
        //Butter is added at end
        //for loop is using original list only
        //modified list is created but reference is updated at the end of loop .



    }
}
