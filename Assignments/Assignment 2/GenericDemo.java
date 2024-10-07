class Node<F>
{
    F data;
    Node<F> next;
    Node(F data)
    {
        this.data=data;
        this.next=null;
    }
}

class GenericDemo<F>
{
    Node<F> head;

    void addFromBack(F data)
    {
        Node<F> newNode=new Node<>(data);
        if(head==null)
        {
            head=newNode;
        }
        else
        {
            Node<F> temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }

    void printList()
    {
        if(head==null)
        {
            System.out.println("List is Empty");
        }
        else
        {
            Node<F> temp=head;
            while(temp!=null)
            {
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("");
        }
    }

    public static void main(String args[])
    {
        GenericDemo<Integer> generic1=new GenericDemo<>();
        generic1.addFromBack(10);
        generic1.addFromBack(20);
        generic1.addFromBack(30);
        generic1.printList();

        GenericDemo<String> generic2=new GenericDemo<>();
        generic2.addFromBack("My");
        generic2.addFromBack("Name");
        generic2.addFromBack("is");
        generic2.addFromBack("Faizan");
        generic2.printList();
    }
}