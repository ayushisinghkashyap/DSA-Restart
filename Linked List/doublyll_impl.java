public class doublyll_impl {
    public static void main(String[] args) {
        doubleLL dll = new doubleLL();
        dll.insertFirst(56);
        dll.insertFirst(67);
        dll.insertFirst(58);
        dll.insertFirst(34);
        dll.display();

        dll.inserLast(3);
        dll.display();
        dll.insert(3, 15);
        dll.display();

        dll.insertElement(58, 111);
        dll.display();
    }
}
