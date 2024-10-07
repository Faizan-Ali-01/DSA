class SearchingLL
{
    Node head;

    void addToEnd(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    void search(int data)
    {
        if(head==null)
        {
            System.out.println("The Linked List is Empty");
        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                if(temp.data==data)
                {
                    System.out.println("Data Found: "+data);
                    return;
                }
                temp=temp.next;
            }
            System.out.println("Data Not Found: "+data);
        }
    }

    void print()
    {
        if(head==null)
        {
            System.out.println("The Linked List is Empty: ");
            return;
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
    void length()
    {
        int count=0;
        if(head==null)
        {
            System.out.println("The Linked List is Empty");
        }
        else
        {
            Node temp=head;
            while(temp!=null)
            {
                temp=temp.next;
                count++;
            }
            System.out.println("The Length of the Linked List is: "+count);
        }
    }

    public static void main(String args[])
    {
        SearchingLL obj=new SearchingLL();
        obj.addToEnd(5);
        obj.addToEnd(6);
        obj.addToEnd(7);

        obj.search(7);

        obj.print();
        obj.length();


    }
}