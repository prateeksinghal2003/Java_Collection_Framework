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


    public int compareTo(Student2 o)
    {
        return Double.compare(o.cgp,this.cgp);
       // Double.compare(a, b) → compares two double values safely

//        Returns:
//        Result	Meaning
//        negative	a < b
//        0	a == b
//        positive	a > b

//        Your line
//        Double.compare(o.cgp, this.cgp);
//        It means:
//        compare o.cgp with this.cgp in reverse order
//        So it sorts in descending order

//        When sorting, Java calls:
//
//    this.compareTo(o)
//
//        Rule:
//
//        return value	meaning
//        negative	THIS comes before O
//        positive	THIS comes after O
//
//⚠️ Always about this vs o, not about parameters inside Double.compare.
//
//            Now your code
//        Double.compare(o.cgp, this.cgp);
//
//        Suppose:
//
//        this.cgp = 9
//        o.cgp = 8
//
//        Step-1: evaluate
//
//        Double.compare(8, 9) → -1
//
//        Step-2: interpret result in compareTo
//
//        -1 means THIS comes before O
//
//        So 9 comes before 8 → descending order
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
