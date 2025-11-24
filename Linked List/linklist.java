public class linklist {

    Node head;
    Node tail;
    int size;

    public linklist(){
        this.size = 0;
    }

    class Node{
        int val;
        Node next;

        public Node(int val){
           this.val = val;
        }

        public Node(int val, Node node){
            this.val = val;
            this.next = node;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }

    public int sizeLL(){
        Node temp = head;
        while(temp == null){
            this.size++;
            temp = temp.next;
        }

        return this.size;
    }

    public void insertLast(int val){

        if(tail == null){
            insertFirst(val);
            size +=1;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size+=1;
    }

    public void insertIndex(int val, int i){
        Node temp = head;
        for(int p = 1;p<i-1;p++){
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;
        
        size+=1;
    }

    public void deleteFirst(){
        head = head.next;
        size--;
    }

    public void deletelast(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        System.out.println(temp.next.val);
        tail = temp;
        tail.next = null;
        
        size--;
    }

    public Node get(int index){
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }

        return temp;
    }

}