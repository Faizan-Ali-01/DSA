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

    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty. Cannot remove anything");
            return;
        }
        arr[(front++)%capacity]=0;
        size--;
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

    public static void main(String args[])
    {
        QueueUsingArray queue=new QueueUsingArray(4);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Top Element is: "+queue.peek());
        queue.dequeue();
        queue.dequeue();
        System.out.println("Top Element is: "+queue.peek());
        System.out.println("Size of queue is: "+queue.size());
        if(queue.isEmpty())
            System.out.println("Queue is Empty");
        else
            System.out.println("Queue is not Empty");
    }
}