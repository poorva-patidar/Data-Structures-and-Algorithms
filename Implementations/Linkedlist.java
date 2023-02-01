public class Linkedlist<T> {
    Node head;

    class Node{
        T data;
        Node next;

        public Node(){
            data = null;
            next = null;
        }

        public Node(T data){
            this.data = data;
            next = null;
        }
    }

    public Linkedlist(){
        head = new Node();
    }

    public void insertFront(T data){
        Node newNode = new Node(data);
        newNode.next = head.next;
        head.next = newNode;
    }

    public void insertEnd(T data){
        Node newNode = new Node(data);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertKey(T data, T key){
        Node newNode = new Node(data);
        Node temp = head;

        while(temp.data != key){
            if(temp.next == null)
                break;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }



    public void print(){
        System.out.print("Linked List: ");
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
            System.out.print(temp.data + " ");
        }
        System.out.println();
    }

    public void merger(Linkedlist<T> ll2){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = ll2.head.next;
    }

    public T deleteFront(){
        T x = null;

        if(head.next != null) {
            Node temp = head.next;
            x = temp.data;
            head.next = temp.next;
            temp.next = null;
        }
        return x;
    }

    public  T deleteEnd(){
        T x = null;

        if (head.next != null) {
            Node temp = head;
            Node prev = null;

            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            x = temp.data;
            prev.next = null;
        }

        return x;
    }

    public void deleteKey(T key){
        Node temp = head;
        Node prev = null;

        if (head.next != null) {
            while (temp.data != key) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            temp.next = null;
        }

    }
}
