// Stack Implementation using Arrays
public class StackA<T> {

    private T[] arr;
    private int top;

    public StackA(T[] arr){
        top = -1;
        this.arr = arr;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return (arr.length - 1) == top;
    }

    public void push(T data){
        if(isFull())
            System.out.println("Stack is Full!");
        else{
            top++;
            arr[top] = data;
        }
    }

    public T pop(){
        T x = null;
        if(isEmpty())
            System.out.println("Stack Underflow");
        else{
            x = arr[top];
            top--;
        }
        return x;
    }

    public T peek(){
        T x = null;
        if(isEmpty())
            System.out.println("Stack Underflow");
        else
            x = arr[top];

        return x;
    }
}

