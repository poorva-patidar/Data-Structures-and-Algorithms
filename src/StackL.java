// Stack Implementation using Linked list
public class StackL<T> {
    private final Linkedlist<T> ls;
    private int size;

    public StackL() {
        ls = new Linkedlist<>();
        size = 0;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public void push(T data){
        ls.insertFront(data);
        size++;
    }

    public T pop(){
        T x = null;

        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        else{
            x = ls.deleteFront();
            size--;
        }

        return x;
    }

    public T peek(){
        T x = null;

        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        else{
            x = ls.deleteFront();
            ls.insertFront(x);
        }

        return x;
    }
}
