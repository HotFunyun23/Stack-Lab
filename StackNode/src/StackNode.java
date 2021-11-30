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
    public boolean isEmpty(){
        return element == null;
    }


}
