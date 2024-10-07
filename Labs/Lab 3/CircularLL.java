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

class CircularLL
{
    boolean cycleCheck(Node head)
    {
        if (head==null)
        {
            return false;
        }
        
        Node prev=head;
        Node temp=head;

        while (temp!=null && temp.next!=null)
        {
            prev=prev.next;         
            temp=temp.next.next;     

            if (prev==temp)
            {
                return true;  
            }
        }
        return false;  
    }
    public static void main(String[] args)
    {
        CircularLL obj=new CircularLL();

        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        head.next.next.next=new Node(4);
        head.next.next.next=head.next;

        System.out.println("Circulation: " + obj.cycleCheck(head));
    }
}
