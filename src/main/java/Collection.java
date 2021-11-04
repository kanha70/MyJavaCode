import java.util.ArrayList;
import java.util.List;

public class Collection {
    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(7);

        List<Integer> al2 = new ArrayList<>();
        al2.add(4);
        al2.add(9);
        al2.add(0);

        al2.addAll(al);
        System.out.println("List is:"+al2);
        al2.set(0,5);
        System.out.println("Before Removing "+al2);
        al2.removeAll(al);
        System.out.println("After Removing "+al2);

    }
}
