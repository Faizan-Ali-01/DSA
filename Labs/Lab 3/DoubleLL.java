class DoubleLL
{
    Node head;

    public void insertAtBeginning(String name)
    {
        Node newNode=new Node(name);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
    }
    public void insertAtBeginning(Node node)
    {
        if(node==null)
        {
            return;
        }
        if(head==null)
        {
            head=node;
        }
        else
        {
            node.next=head;
            head.prev=node;
            head=node;
        }
    }
    public void insertAtEnd(String name)
    {
        Node newNode=new Node(name);
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
            newNode.prev=temp;
        }
    }
    public void insertAtEnd(Node node)
    {
        if(node==null)
        {
            return;
        }
            if(head==null)
            {
                head=node;
            }
            else
            {
                Node temp=head;
                while(temp.next!=null)
                {
                    temp=temp.next;
                }
                temp.next=node;
                node.prev=temp;
        }
    }
    public void insertAfterName(String name, Node node)
    {
        if(head==null)
        {
            System.out.println("List is Empty. Cannot find Name");
            return;
        }
        Node temp = head;
        while (temp != null)
        {
            if (temp.data.equals(name))
            {
                node.next=temp.next;
                node.prev=temp;
                if(temp.next!=null)
                {
                    temp.next.prev=node;
                }
                temp.next=node;
                return;
            }
            temp=temp.next;
        }
            System.out.println("Name not found after any data");
    }
    public void insertBeforeName(String name, Node node)
    {
        if(head==null)
        {
            System.out.println("List is Empty. Cannot find Name");
            return;
        }
        if(head.data.equals(name))
        {
            node.next=head;
            head.prev=node;
            head=node;
            return;
        }
        Node temp=head;
        Node prev=null;
        while (temp != null && !temp.data.equals(name))
        {
            prev=temp;
            temp=temp.next;
        }
        if(temp!=null)
        {
            node.next=temp;
            node.prev=prev;
            if(prev!=null)
            {
                prev.next=node;
            }
            temp.prev=node;
        }
        else
        {
            System.out.println("Name not found Before any data");
        }
    }
    public void makeCircular()
    {
        if(head==null || head.next==null)
        {
            System.out.println("The List is Empty");
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=head;
        head.prev=temp;
    }
    public void printAll()
    {
        if(head==null)
        {
            System.out.println("The List is Empty");
            return;
        }
        Node temp=head;
        System.out.print("The List is: ");
        do
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        while(temp != head && temp != null);
        System.out.print("End\n");
    }

    public static void main(String[] args)
    {
        DoubleLL obj=new DoubleLL();
        obj.insertAtBeginning("E");
        obj.insertAtBeginning("C");

        Node node1=new Node("A");
        obj.insertAtBeginning(node1);

        obj.insertAtEnd("F");
        obj.insertAtEnd("G");

        Node node2=new Node("H");
        obj.insertAtEnd(node2);

        Node node3=new Node("B");       
        obj.insertAfterName("A", node3);

        Node node4=new Node("D");
        obj.insertBeforeName("E", node4);
        obj.makeCircular();
        obj.printAll();
    }
}