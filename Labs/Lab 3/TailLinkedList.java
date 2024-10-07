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

class TailLinkedList
{
    Node head;
    Node tail;
    int size;

    void addToBack(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
        size++;
    }

    void addToFront(int data) {
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
        if (tail==null) {
            tail=newNode;
        }
        size++;
    }

    void removeFromFront()
    {
        if(head==null)
        {
            System.out.println("The List is Empty");
            return;
        }
        head=head.next;
        if (head==null)
        {
            tail=null;
        }
        size--;
    }
    void removeFromBack()
    {
        if(head==null)
        {
            System.out.println("The List is Empty");
            return;
        }
        if(head.next==null)
        {
            head=null;
            tail=null;
        }
        else
        {
            Node temp = head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
        size--;
    }
    boolean isEmpty()
    {
        return head==null;
    }

    void printList()
    {
        if(head==null)
        {
            System.out.println("The List is Empty");
            return;
        }
        Node temp = head;
        System.out.print("The List is: ");
        while (temp!=null)
        {
            System.out.print(temp.data+"--> ");
            temp=temp.next;
        }
        System.out.print("END\n");
    }
    public static void main(String[] args) {
        TailLinkedList obj = new TailLinkedList();
        obj.addToFront(5);
        obj.addToBack(7);
        obj.addToBack(9);
        obj.printList();

        obj.removeFromFront();
        obj.removeFromBack();
        obj.printList();
    }
}
