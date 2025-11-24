public class doubleLL {
    Node head;
    int size;

    public doubleLL(){
        this.size = 0;
    }
    class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head != null){
            head.prev = node;
        }
        head = node;

        size +=1;

    }
    public void inserLast(int val){
        if(head == null){
            insertFirst(val);
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }

            Node node = new Node(val);
            temp.next = node;
            node.prev = temp;
            node.next = null;
        }

    }

    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("Null");

        while(last != null){
            System.out.print(last.val+" -> ");
            last = last.prev;
        }
        System.out.println("Null");

        System.out.println(size);
    }

    public void insert(int index, int val){
        Node temp = head;
        for(int i=1;i<index-1;i++){
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
         
    }

    public int find(int val){
        Node temp = head;
        int p = 0;
        while(temp.val != val){
            temp = temp.next;
            p++;
        }

        return p;
    }

    public void insertElement(int before , int val){
        int p = find(before);
        insert(p, val);
    }

}
