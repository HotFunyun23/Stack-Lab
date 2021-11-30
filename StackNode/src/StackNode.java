/*
Big header(Let's Gooooo)

 */
public class StackNode<E> {


    private StackNode<E> next;
    private E element;

    public void push(E element){
        next = new StackNode<E>();
        this.element = element;

    }















    public E pop(){
        if(next.isEmpty){
            System.out.println("Stack is Empty");
        }
        E top = element;
        element = next.element;
        next = next.next;

        return top;
    }


}
