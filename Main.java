import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Creating an Array Class - Coding with Mosh
        /*
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        System.out.println(numbers.indexOf(100));
        numbers.print();
        */

        //ArrayLists
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        /* Various ArrayList Methods
        list.remove(0);
        list.indexOf(20);
        list.lastIndexOf(20);
        list.size();
        list.toArray();
        */
        System.out.println(list);
    }
}
