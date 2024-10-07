class StackUsingArray
{
    int arr[];
    int size;
    int capacity;

    StackUsingArray(int capacity)
    {
        arr = new int[capacity];
        this.capacity = capacity;
        size=0;
    }
    public void push(int data)
    {
        if(!isFull())
        {
            arr[size++]=data;
            return;
        }
        System.out.println("Stack is Full. Cannot add another Element");
    }
    public int pop()
    {
        if(!isEmpty())
        {
            return arr[--size];
        }
        System.out.println("Nothing to Remove");
        return 0;
    }
    public int top()
    {
        if(!isEmpty())
        {
            return arr[size-1];
        }
        System.out.println("No top Element to return");
        return 0;
    }
    public int size()
    {
        return size;
    }
    public Boolean isEmpty()
    {
        return size==0;
    }
    public Boolean isFull()
    {
        return size==capacity;
    }
}

class QueueUsingStack
{
    StackUsingArray s1,s2;
    QueueUsingStack()
    {
        s1=new StackUsingArray(5);
        s2=new StackUsingArray(5);
    }

    void enqueue(int data)
    {
        s1.push(data);
    }

    int dequeue()
    {
        if(s1.isEmpty() && s2.isEmpty())
        {
            System.out.println("The Queue is Empty. Cannot remove anything");
            return -1;
        }
        if(s2.isEmpty())
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        QueueUsingStack queue=new QueueUsingStack();
        for(int array:arr)
        {
            queue.enqueue(array);
        }
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}