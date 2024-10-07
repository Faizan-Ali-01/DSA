class LinkedList implements List
{
    Node head;
    int size;
    LinkedList()
    {
        head=new Node(0);
        size=0;
    }
    class Node
    {
        Object data;
        Node next;
        Node(Object data)
        {
            this.data=data;
            this.next=null;
        }
    }

    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public void add(Object item)
    {
        Node newNode=new Node(item);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newNode;
        size++;
    }
    public void add(int index, Object item)
    {
        if(index<1 || index>size+1)
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        else
        {
            Node newNode=new Node(item);
            Node temp=head;
            for(int i=1;i<index;i++)
            {
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
            size++;
        }
    }
    public void remove(int index)
    {
        if(index<1 || index>size)
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        else
        {
            Node temp=head;
            for(int i=1;i<index;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    public void remove(Object item)
    {
        Node temp=head;
        while(temp.next!=null)
        {
            if(temp.next.data.equals(item))
            {
                temp.next=temp.next.next;
                size--;
                return;
            }
            temp=temp.next;
        }
    }
    public List duplicate()
    {
        LinkedList dup=new LinkedList();
        Node temp=head.next;
        while(temp!=null)
        {
            dup.add(temp.data);
            temp=temp.next;
        }
        return dup;
    }
    public List duplicateReversed()
    {
        LinkedList revdup=new LinkedList();
        Node temp=head.next;
        while(temp!=null)
        {
            Node newNode=new Node(temp.data);
            newNode.next=revdup.head.next;
            revdup.head.next=newNode;
            temp=temp.next;
        }
        revdup.size=size;
        return revdup;
    }
    public void printList()
    {
        Node temp=head.next;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        LinkedList obj=new LinkedList();
        obj.add("A");
        obj.add("C");
        obj.add("D");
        obj.add(2,"B");
        System.out.print("Original list is: ");
        obj.printList();

        List duplicateList=obj.duplicate();
        System.out.print("Duplicate list is: ");
        duplicateList.printList();

        List revList=obj.duplicateReversed();
        System.out.print("Reversed List is: ");
        revList.printList();

        obj.remove(4);
        obj.remove("C");
        System.out.print("After removing C and D from original list: ");
        obj.printList();
    }
}