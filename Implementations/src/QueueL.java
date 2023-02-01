//Implementation of Queue using Linkedlist
public class QueueL<T> {
    private final Linkedlist<T> ll;
    private int size;

    public QueueL(){
        ll = new Linkedlist<>();
        size = 0;
    }

    private boolean isEmpty(){
        return (ll.head.next == null);
    }

    public int length(){
        return size;
    }

    public void enqueue(T data){
        ll.insertFront(data);
        size++;
    }

    public T dequeue(){
        T x = null;

        if (isEmpty()){
            System.out.println("Queue is empty!");
        }
        else {
            x = ll.deleteEnd();
            size--;
        }

        return x;
    }
}


