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

class Sorting {
    int size=0;
    Node head;
    Sorting()
    {
       head=null; 
    }  
    void addToBack(int data)
    {
        Node node = new Node(data);
        if (head == null)
            head = node;
        else
        {
            Node n = head;
            while (n.next != null)
                n = n.next;
                n.next = node;
        }
        size++;
    }
    void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.print("Null");
        System.out.println();
    }

    public void sort()
    {
        if (size > 1)
        {
            for (int i = 0; i < size - 1; i++)
            {
                Node currentNode = head;
                Node previous = null;
                while (currentNode != null && currentNode.next != null)
                {
                    Node nextNode = currentNode.next;
                    if (currentNode.data > nextNode.data)
                    {
                        currentNode.next = nextNode.next;
                        nextNode.next = currentNode;
                        if (previous != null)
                        {
                            previous.next = nextNode;
                        }
                        else
                        {
                            head = nextNode;
                        }
        
                        previous = nextNode;
                    }
                    else
                    {
                        previous = currentNode;
                        currentNode = currentNode.next;
                        
                    }
                }
            }
        }
    }
    void addF(int data)
    {
        Node  newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            }
            else {
                newnode.next=head;
                head=newnode;
                    
            }
            size++;
        }
    

        void CheckDup(){
            if(head==null){
                System.out.println("List is Empty!");
                return;
            }
            Node current = head;
            while (current != null) {
                Node runner = current;
    
                
                while (runner.next != null) {
                    if (runner.next.data == current.data) {
                      
                        runner.next = runner.next.next;
                    } else {
                        runner = runner.next;
                    }
                }
    
                current = current.next;
            }
    }

    public static void main(String[] args)
    {
        Sorting list=new Sorting();
        list.addToBack(4);
        list.addToBack(23);
        list.addToBack(4);
        list.addToBack(1);
        System.out.print("The Original List is: ");
        list.print();
        list.sort();
        System.out.print("After Sorting List is: ");
        list.print();
        list.CheckDup();
        System.out.print("After removing Duplicates List is: ");
        list.print();
    }
}