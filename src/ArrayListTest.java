import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String args[]) {
        ArrayList<Integer> alist = new ArrayList<>() ;

        alist.add(6);          alist.add(4);            alist.add(12);

        System.out.println(alist);
        System.out.println(alist.get(2));

        System.out.println(alist.getFirst());
        System.out.println(alist.getLast());

        

    }
}
