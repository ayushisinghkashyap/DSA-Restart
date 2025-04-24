import java.util.*;
public class operations {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        // ArrayList<Character> list3 = new ArrayList<>();

        // Adding element
        list.add(45);
        list.add(67);
        list.add(89);
        list.add(90);

        System.out.println("Original list: "+list);

        // Get element
        System.out.println("Array at index 2: "+list.get(2));

        // deleting element
        list.remove(1);
        System.out.println("After removing elemnts: "+list);

        // set element at index
        list.set(2,78);
        list.set(1,444);
        System.out.println("After inserting some elements: "+list);


        // contains method -> return boolean and check if the element is present in list or not
        System.out.println(list.contains(78));
        System.out.println(list.contains(999));

        // size of ArrayList
        System.out.println("Size of the arraylist: "+list.size());

        // iteration 
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

    }
}