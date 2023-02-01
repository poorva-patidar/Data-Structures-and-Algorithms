//Implementation of Queue using Array
public class QueueA <T> {
    private final T[] arr;
    private int rear, front;

    public QueueA(T[] array) {
        rear = -1;
        front = 0;
        arr = array;
    }

    private boolean isEmpty() {
        return (front > rear);
    }

    private boolean isFull() {
        return (rear == arr.length - 1);
    }

    public void enqueue(T data) {
        if (isFull())
            System.out.println("Queue is Full!");
        else {
            rear++;
            arr[rear] = data;
        }
    }

    public T dequeue(){
        T x = null;

        if(isEmpty()) {
            System.out.println("Queue is Empty!");
            resetQueue();
        }
        else{
            x = arr[front];
            front++;
        }
        return x;
    }

    private void resetQueue() {
        rear = -1;
        front = 0;
    }

}

