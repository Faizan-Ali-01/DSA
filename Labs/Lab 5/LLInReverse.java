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

public class LLInReverse
{
    Node head;
    void addToFront(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    void printList()
    {
        if(head==null)
        {
            System.out.println("The List is empty");
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
    void printReverse(Node temp)
    {
        if(temp==null)
        {
            return;
        }
        printReverse(temp.next);
        System.out.print(temp.data+" ");
    }

    public static void main(String args[])
    {
        LLInReverse obj=new LLInReverse();
        obj.addToFront(5);
        obj.addToFront(4);
        obj.addToFront(3);
        obj.addToFront(2);
        obj.addToFront(1);
        System.out.print("The Original List is: ");
        obj.printList();
        System.out.print("The Reversed List is: ");
        obj.printReverse(obj.head);
    }
}