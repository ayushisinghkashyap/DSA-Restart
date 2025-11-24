public class circularLL {
    Node head;
    Node tail;
    public circularLL(){
        this.head = null;
        this.tail = null;
    }

    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        
            tail.next = node;
            node.next = head;
            tail = node;
        
    }

    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        while(temp != head);
        System.out.println();
    }

}
