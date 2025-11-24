public class linklist_Imp {
    public static void main(String[] args) {
        linklist ll = new linklist();

        ll.insertFirst(34);
        ll.insertFirst(21);
        ll.insertFirst(67);
        ll.insertLast(78);
        System.out.println(ll.get(1));
        ll.insertIndex(45, 3);
        ll.deleteFirst();
        ll.deletelast();
        ll.print();
        System.out.println(ll.size);
    }
}
