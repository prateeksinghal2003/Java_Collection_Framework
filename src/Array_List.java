import java.util.*;

class String_Comparing implements Comparator<String>
{
    @Override
    public int compare(String s1,String s2)
    {
        //sorting in ascending order on the basis of length
        return s1.length()-s2.length();
    }
}

class Integer_Comparing implements Comparator<Integer> {
    @Override
    //if o1 is > o2, then we get positive value , o1 is come later
    //o1--3,o2---5
    //want in ascending order
    //o1-o2 , gives negative , means o1 comes first , so for ascending do o1-o2

    //o1---5,o2---3
    //want in ascending order
    //o1-o2 , gives positive , means o1 comes later , so for ascending do o1-o2
    public int compare(Integer o1, Integer o2) {
        //sort in ascending order
        return o1 - o2;

        //for descending order
        //return o2-o1;

    }
}
class Student
{
    String name;
    double cgp;

    Student(String n,double c)
    {
        name=n;
        cgp=c;
    }

    @Override
    public String toString()
    {
        return name +"-->"+cgp;
    }

}


public class Array_List
{
    public static void main (String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);

        System.out.println(al.get(0));
        System.out.println(al);
        //al.size();---returns size
        //al.contains(4);-->returns boolean value
        // al.remove(2);--remove from index 2
        //can also remove by value ,but have to pass an object
        al.remove(Integer.valueOf(10));
        System.out.println(al);
        //all elements from index 3 are shifted left by one place
        // al.add(1,4);--at index 1 element 4 is added
        // and whatever the element is at index 1 is shifted to right

        //al.set(1,3);//at index 1 what ever is the element replace by 3

        //can also set the capacity of arraylist
        ArrayList<Integer> list=new ArrayList<>(12);

        List<String> list1= Arrays.asList("Mon","Tue","Wed");
        System.out.println(list1);
        //cannot add or remove the elements from this list1
        //since asList() returns a fix size list

        //to make modifications in this list
        ArrayList<String> list2=new ArrayList<>(list1);
        list2.add("Thur");
        System.out.println(list2);

        ArrayList<String> list3=new ArrayList<>();
        list3.addAll(list2);
        list3.add("Fri");
        System.out.println(list3);

        //Converting to array
        String[] array1=list.toArray(new String[0]);

        //Sort an array
        Collections.sort(list3);

        //get an element --O(1)
        //Add --O(n)


        //Comparator interface
        al.add(23);
        al.add(7);

        al.sort(new Integer_Comparing());
        System.out.println(al);

        //sorting string on the basis of length
        list3.sort(new String_Comparing());
        System.out.println(list3);

        //using lambda expressions
        list3.sort((a,b)->b.length()-a.length());
        System.out.println(list3);


        ArrayList<Student> stud=new ArrayList<>();
        stud.add(new Student("Tejus",4.6));
        stud.add(new Student("Karan",4.6));
        stud.add(new Student("Vijay",8.6));
        stud.add(new Student("Roy",6.8));

        //o1 is coming after o2 when o2 cgpa is > than o1
        //cgp in descending order
        stud.sort((o1,o2)->
        {
            if(o2.cgp-o1.cgp>0)
                return 1;

            else if(o1.cgp- o2.cgp>0)
                return -1;

            else
                //if cgp same , then sort by names in ascending order
                return o1.name.compareTo(o2.name);
        });

        System.out.println(stud);











    }
}
