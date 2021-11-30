Assignment Instructions

Stacks are a data structure where elements are enqueued and dequeued in Last In First Out order. 
The data that a Stack keeps track of are: 1) its size and 2) a reference to the top node.

Each node in a stack keeps track of 1) its data and 2) a reference to the node beneath it.

The main stack operations are:

push - add a new node to the top of the stack

pop - remove the top node of the stack and return it

peek - return the top node of the stack without deleting it from the stack.

Things you will need to do for this lab:

1) Create a new StackNode object with the data listed above.

2) Create a new Stack object with the data listed above.

3) Create a Test Driver to test out the methods contained in StackNode and Stack. Keep edge cases in mind.

The methods I will require you to create for your Stack are as follows:

void push(E element)    //add an element
E pop()                 //remove and return the top element
boolean isEmpty()   
int size()
E peek()                //look at the top element without removing

Based on your understanding of how Nodes work, you will need to determine the necessary StackNode methods on your own.

Please work ALONE to complete this assignment, using git version control, good commit messages, and feature branches. 
Feel free to use Google (or any of your classmates) for collaborative help, but do write the code yourself. 
I will be here to answer any questions you might have, but please FULLY READ THIS ASSIGNMENT FIRST before asking any clarifying questions about the lab.
