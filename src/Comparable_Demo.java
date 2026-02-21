import java.util.ArrayList;
import java.util.List;

//this interface is used to define natural ordering
class Student2 implements Comparable<Student2>
{
    String name;
    double cgp;

    public Student2(String name, double cgp) {
        this.name = name;
        this.cgp = cgp;
    }

    @Override
    //4.compareTo(3)
    //want in descending order
    //4 comes before 3
    //will only happen when 3.compareTo(4)

    public int compareTo(Student2 o)
    {
        return Double.compare(o.cgp,this.cgp);
    }

    @Override
    public String toString() {
        return this.name +":"+this.cgp;
    }
}

public class Comparable_Demo {

    public static void main(String[] args)
    {
        List<Student2> list = new ArrayList<>();
        list.add(new Student2("Charlie", 3.5));
        list.add(new Student2("Bob", 3.7));
        list.add(new Student2("Alice", 3.5));
        list.add(new Student2("Akshit", 3.9));

        //null means natural ordering
        //for integer,string it would work
        list.sort(null);
        System.out.println(list);
    }

}
