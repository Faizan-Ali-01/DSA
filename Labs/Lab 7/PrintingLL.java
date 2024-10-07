class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class PrintingLL
{
    Node head;
    void addToFront(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    void printUsingIteration()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    Node printUsingRecursion(Node node)
    {
        if(node==null)
            return null;
        else
        {
            System.out.print(node.data+" ");
            return printUsingRecursion(node.next);
        }

    }
    public static void main(String args[])
    {
        long startTime,endTime;
        long iterativeTime,recursiveTime;

        PrintingLL obj=new PrintingLL();
        obj.addToFront(5);
        obj.addToFront(4);
        obj.addToFront(3);
        obj.addToFront(2);
        obj.addToFront(1);

        startTime=System.nanoTime();
        obj.printUsingIteration();
        endTime=System.nanoTime();
        iterativeTime=endTime-startTime;

        startTime=System.nanoTime();
        obj.printUsingRecursion(obj.head);
        endTime=System.nanoTime();
        recursiveTime=endTime-startTime;
        System.out.println();
        
        if(iterativeTime>recursiveTime) 
            System.out.println("Recursive Method is Better");
        else
            System.out.println("Iterative Method is Better");
    }
}