/**
 Stack Node
 Author: Conor
 Date: 11/30/2021
 **/
public class StackNode<E> {

//instance data
    private StackNode<E> next;
    private E element;

    //pushes element to top
    public void push(E element){
        next = new StackNode<E>();
        this.element = element;

    }
    // empty
    public boolean isEmpty(){
        return element == null;
    }
    //if empty tells and gives element
    public E pop(){
        if(next.isEmpty){
            System.out.println("Stack is Empty");
        }
        E top = element;
        element = next.element;
        next = next.next;

        return top;
    }
//gives size
    public int size(){
        return this.isEmpty() ? 0 : 1 + this.next.size(); //recursion?? lets see if it works
    }
//gives top
    public E peek(){
        return element;
    }

}
