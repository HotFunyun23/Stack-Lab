/**
 Stack Node
 Author: Conor
 Collaberation: Mareks' from our array list project
 Date: 11/30/2021
 **/
public class StackNode <E>{
    //instance data
    //two node project instances to store pointers
    //parents node
    private StackNode node1;
    //child node
    private StackNode node2;
    //store a way to assign values to the nodes
    private E value;

    //default constructor
    public StackNode(){
        node1 = null;
        node2 = null;
        value = null;
    }
    // constructor2
    public StackNode(E value){
        node1 = null;
        node2 = null;
        this.value = value;
    }
    // constructor3
    public StackNode(E value, StackNode node1, StackNode node2){
        this.value = value;
        this.node1 = node1;
        this.node2 = node2;
    }

    //all mutators
    public void setValue(E value){
        this.value = value;
    }
    public void setNode1(StackNode node1){
        this.node1 = node1;
        makeChild(node1);
    }
    public void setNode2(StackNode node2){
        this.node2 = node2;
        makeParent(node2);
    }

    //make a child node
    private void makeChild(StackNode node1){
        this.node2 = node1;
    }
    //make a parent node
    private void makeParent(StackNode node2){
        this.node1 = node2;
    }

    //accessors
    public E getValue(){
        return value;
    }
    public StackNode getNode1(){
        return node1;
    }
    public StackNode getNode2(){
        return node2;
    }

    //toString method
    public String toString(){
        return "Node: " + value.toString();
    }

    //.equals method
    public boolean equals(StackNode node){
        boolean b = this.value.equals(node.getValue());
        return b;
    }
}