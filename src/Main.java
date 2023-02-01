public class Main {

    public static void main(String[] args) {
        testLinkedList();
        testStack();
        testStackL();
        testQueue();
        testQueueL();
    }

    private static void testQueueL() {
        QueueL<Integer> q = new QueueL<>();

        System.out.println("Size: " +  q.length());
        q.dequeue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("Size: " +  q.length());

        System.out.print("Queue: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(q.dequeue() + " ");
        }
        System.out.println();

        System.out.println("Size: " +  q.length());
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);

        System.out.println("Size: " +  q.length());

        for (int i = 0; i < 7; i++) {
            System.out.print(q.dequeue() + " ");
        }
        System.out.println("Size: " +  q.length());
    }

    private static void testQueue() {
        QueueA<Integer> q = new QueueA<>(new Integer[6]);

        q.dequeue();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.print("Queue: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(q.dequeue() + " ");
        }
        System.out.println();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
    }


    private static void testStackL() {

        StackL<Integer> stl = new StackL<>();

        stl.push(1);
        stl.push(2);
        stl.push(3);
        stl.push(4);

        System.out.println("Peek: " + stl.peek());

        System.out.print("Stack: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(stl.pop() + " ");
        }
        System.out.println();
    }


    private static void testLinkedList() {
        Linkedlist<Integer> ll = new Linkedlist<>();

        ll.insertFront(1); // insert at first position
        ll.insertFront(2);
        ll.insertFront(3);
        ll.print();

        ll.insertEnd(4);  // insert at last position
        ll.insertEnd(5);
        ll.insertEnd(6);
        ll.print();

        ll.insertKey(10, 4);  // insert after element k
        ll.print();

        Linkedlist<Integer> ll2 = new Linkedlist<>();
        ll2.insertFront(99);
        ll2.insertFront(98);
        ll2.insertFront(97);

        ll.merger(ll2);  // merge another linkedlist at the end
        ll.print();

        int x = ll.deleteFront();
        int y = ll.deleteEnd();
        ll.deleteKey(6);
        ll.print();
        System.out.println("Deleted nodes data: " + x + " " + y + " 6");
    }

    private static void testStack() {
        StackA<Integer> st = new StackA<>(new Integer[10]);

        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        for (int i = 0; i < 5; i++) {
            System.out.print(st.pop() + " ");
        }

        System.out.println();

        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);

        System.out.println("Peek: " + st.peek());

        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(9);
        st.push(10);
        st.push(11);

    }
}
