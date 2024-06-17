import java.util.*;

public class StackClass{

    static class Node{
        int data;
        Node next;
        // create constructor
        public Node(int data){
            this.data=data;
            next=null;

        }
    }

    static class Stack{
        public static Node head;  // stack ka top
        //for check linkedlist empty or not
        public static boolean isEmpty()
        {
            return head == null;
        }

        //push func.
        public static void push(int data)
        {
            Node newNode= new Node(data);  //for push
            if(isEmpty()){
                head=newNode;
                return;
            }
            // if stack not empty then 
            newNode.next=head;
            head=newNode;

            //for pop its delete the data and return the data
            public static int pop() {
                if(isEmpty()){
                    return -1;
                }
              
                int top = head.data;
                head = head.next; // point to next node become head now top delete
                return top;
            }
          
            public static int peek() {
                if(isEmpty()){
                    return -1;
                }
                
                return head.data;
            }

        }

    }
    public static void main(String args[]){
    
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

       while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
       }
    }

}