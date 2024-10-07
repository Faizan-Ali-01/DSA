class Reverse
{
    Node head;
    int size=0;
    void addToBack(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
        size++;
    }

    void addToFront(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head=newNode;
        }
        size++;
    }


    void printList()
    {
        if(head==null)
        {
            System.out.println("The List is Empty");
        }
        else
        {
            Node temp=head;
            System.out.print("The List is: ");
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    void reverse()
    {
        Reverse rev=new Reverse();
        if(head==null)
        {
            System.out.println("This list is Empty");
        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                rev.addToFront(temp.data);
                temp=temp.next;
            }
        }
        head=rev.head;
    }

    public static void main(String args[])
    {
        Reverse list = new Reverse();
        list.addToBack(10);
        list.addToBack(3);
        list.addToBack(8);
        list.addToBack(2);
        list.printList();

        list.reverse();
        list.printList();
    }
}