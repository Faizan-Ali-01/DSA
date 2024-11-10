class Node
{
    int data;
    Node next;
    Node (int data)
    {
        this.data=data;
        this.next=null;
    }
}
class SortAndMerge
{
    static Node sortAndMerge(Node node1,Node node2)
    {
        Node temporary=new Node(0);
        Node temp=temporary;
        while(node1 != null && node2 != null)
        {
            if(node1.data < node2.data)
            {
                temp.next=node1;
                node1=node1.next;
            }
            else
            {
                temp.next=node2;
                node2=node2.next;
            }
            temp=temp.next;
        }
        if(node1!=null)
            temp.next=node1;
        else
            temp.next=node2;

        return temporary.next;
    }
    static void printList(Node node)
    {
        while(node!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Node head1=new Node(1);
        head1.next=new Node(2);
        head1.next.next=new Node(3);
        head1.next.next.next=new Node(4);
        head1.next.next.next.next=new Node(5);

        Node head2=new Node(6);
        head2.next=new Node(7);
        head2.next.next=new Node(8);
        head2.next.next.next=new Node(9);
        head2.next.next.next.next=new Node(10);
        
        Node mergedList=sortAndMerge(head1, head2);
        printList(mergedList);
    }
}