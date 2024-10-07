class QueueUsingArray
{
    int arr[];
    int front;
    int rear;
    int capacity;
    int size;

    QueueUsingArray(int capacity)
    {
        arr=new int[capacity];
        this.capacity=capacity;
        front=0;
        rear=0;
        size=0;
    }

    int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty. Cannot remove anything");
            return -1;
        }
        int removedElement=arr[front];
        arr[(front++)%capacity]=0;
        size--;
        return removedElement;
    }

    void enqueue(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is Full. Cannot add anything");
            return;
        }
        arr[(rear++)%capacity]=data;
        size++;
    }

    int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty. Nothing to show");
            return 0;
        }
        return arr[front%capacity];
    }

    int size()
    {
        return size;
    }

    boolean isEmpty()
    {
        return size==0;
    }

    boolean isFull()
    {
        return size==capacity;
    }
}

class StackUsingQueue
{
    QueueUsingArray q1,q2;
    StackUsingQueue()
    {
        q1=new QueueUsingArray(5);
        q2=new QueueUsingArray(5);
    }

    void push(int data)
    {
        q1.enqueue(data);
    }
    int pop()
    {
        if(q1.isEmpty() && q2.isEmpty())
        {
            System.out.println("Stack is Empty. Cannot remove anything");
            return -1;
        }
        while(q1.size()>1)
        {
            q2.enqueue(q1.dequeue());
        }
        int topElement=q1.peek();

        q1.dequeue();

        QueueUsingArray temp=q1;
        q1=q2;
        q2=temp;
        return topElement;
    }

    int peek()
    {
            if (q1.isEmpty() && q2.isEmpty())
            {
                System.out.println("Stack is Empty. Nothing to show");
                return -1;
            }
            while (q1.size() > 1)
            {
                q2.enqueue(q1.dequeue());
            }
            int topElement = q1.peek();
            q2.enqueue(q1.dequeue());
            QueueUsingArray temp = q1;
            q1 = q2;
            q2 = temp;
    
            return topElement;
    }

    public static void main(String args[])
    {
        StackUsingQueue stack=new StackUsingQueue();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
    }
}