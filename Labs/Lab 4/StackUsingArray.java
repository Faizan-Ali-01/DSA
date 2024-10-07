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
    
    public static void main (String[] args)
    {
        StackUsingArray stack = new StackUsingArray(3);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop()+" is popped");
        System.out.println(stack.pop()+" is popped");
        stack.push(3);
    
        System.out.println("Top element is: " + stack.top());
        System.out.println("Stack size is " + stack.size());
        stack.pop();

        if (stack.isEmpty())
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");
    }
}