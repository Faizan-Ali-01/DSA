class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class QueueUsingLL
{
    Node front,rear;

    int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty. Cannot Remove anything");
            return 0;
        }
        Node temp=front;
        front=front.next;
        return temp.data;
    }
    void enqueue(int data)
    {
        Node newNode=new Node(data);
        if(isEmpty())
        {
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty. Nothing on Top");
            return 0;
        }
        return front.data;
    }
    boolean isEmpty()
    {
        return front==null;
    }

    public static void main(String args[])
    {
        QueueUsingLL queue=new QueueUsingLL();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.printf("Front element is %d\n",queue.peek());
        
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        if(queue.isEmpty())
            System.out.print("Queue is Empty");
        else
            System.out.print("Queue is not Empty");
    
    }
}