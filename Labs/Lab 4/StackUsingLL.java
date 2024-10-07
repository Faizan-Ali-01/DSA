class Node
{
    Object data;
    Node next;
    Node(Object data)
    {
        this.data=data;
        this.next=null;
    }
}

class StackUsingLL
{
    Node head;
    int size=0;

    void push(Object data)
    {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        size++;
    }


    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty, Cannot pop anything");
            return;
        }
        head=head.next;
        size--;
    }

    boolean isEmpty()
    {
        return size==0;
    }
    Object top()
    {
        if(isEmpty())
        {
            return null;
        }
        return head.data;
    }

    public static void main(String args[])
    {
        StackUsingLL stack=new StackUsingLL();
        {
            stack.push(10);
            stack.push("A");
            stack.push(10);
            System.out.println("Top Element is: "+stack.top());
            stack.pop();
            System.out.println("Top Element is: "+stack.top());
            stack.pop();
            stack.pop();

            if(stack.isEmpty())
                System.out.println("Stack is Empty");
            else
                System.out.println("Stack is not Empty");
        }
    }
}