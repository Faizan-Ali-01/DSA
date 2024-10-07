class NthNode
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

    void searchNthNode(int index)
    {
        if(index < 0 || index >=size)
        {
            System.out.println("Invalid index");
        }
        else
        {
            Node temp=head;
            for(int i=size;i!=index;i--)
            {
                temp=temp.next;
            }
            System.out.println("The "+index+"th Node is: "+temp.data);
            return;
            
        }
    }

    void sort()
    {
        if(head==null || head.next==null)
        {
            System.out.println("List is Empty");
            return;
        }
        Node current,next,prev,temp;
        Node last=null;
        for(current=head;current.next!=last;current=current.next)
        {
            boolean swap=false;
            prev=null;
            for(next=head;next.next != last; next=next.next)
            {
                if(next.data > next.next.data)
                {
                    temp=next.next;
                    next.next=temp.next;
                    temp.next=next;

                    if(prev!=null)
                    {
                        prev.next=temp;
                    }
                    else
                    {
                        head=temp;
                    }
                    prev=temp;
                    swap=true;
                }
                else
                {
                    prev=next;
                }
            }
            last=current;
            if(!swap)
            {
                break;
            }
        }
    }

    public static void main(String args[])
    {
        NthNode list = new NthNode();
        list.addToBack(10);
        list.addToBack(3);
        list.addToBack(8);
        list.addToBack(2);
        list.printList();
        list.searchNthNode(3);

        list.sort();
        list.printList();
    }
}