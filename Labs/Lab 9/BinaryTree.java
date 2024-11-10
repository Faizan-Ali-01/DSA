class Node
{
    int data;
    Node left,right;
    Node (int data)
    {
        this.data=data;
        this.left=this.right=null;
    }
}

class BinaryTree
{
    Node root;
    BinaryTree(int data)
    {
        root = new Node(data);
    }
    BinaryTree()
    {
        root = null;
    }
    public void addNode(int data)
    {
        root=addRecursively(root,data);
    }
    Node addRecursively(Node currentRoot,int data)
    {
        if(currentRoot==null)
        {
            return new Node(data);
        }
        if(data<currentRoot.data)
        {
            currentRoot.left=addRecursively(currentRoot.left,data);
        }
        else
        {
            currentRoot.right= addRecursively(currentRoot.right,data);
        }
        return currentRoot;
    }
    public boolean searchNode(int data)
    {
        return searchRecursively(root, data);
    }
    boolean searchRecursively(Node currentRoot,int data)
    {
        if(currentRoot==null)
        {
            return false;
        }
        if(currentRoot.data==data)
        {
            return true;
        }
        else if(data<currentRoot.data)
        {
            return searchRecursively(currentRoot.left,data);
        }
        else
        {
            return searchRecursively(currentRoot.right,data);
        }
    }

    public int countOfNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1+countOfNodes(root.left)+countOfNodes(root.right);
    }

    public int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return 1+Math.max(leftHeight,rightHeight);
    }

    int maxFind(Node root)
    {
        if(root.right==null)
        {
            return root.data;
        }
        return maxFind(root.right);
    }
    int minFind(Node root)
    {
        if(root.left==null)
        {
            return root.data;
        }
        return minFind(root.left);
    }

    boolean balanceCheck(Node root)
    {
        return balanceCheckRecursively(root) != -1;
    }
    int balanceCheckRecursively(Node root)
    {
        if(root==null)
            return 0;
        int leftHeight=balanceCheckRecursively(root.left);
        if(leftHeight==-1)
            return -1;

        int rightHeight=balanceCheckRecursively(root.right);
        if(rightHeight==-1)
            return -1;
        if(Math.abs(leftHeight-rightHeight)>1)
            return -1;
        return 1+Math.max(leftHeight,rightHeight);
    }

    public static void main(String[] args)
    {
        BinaryTree tree=new BinaryTree(50);
        tree.addNode(30);
        tree.addNode(25);
        tree.addNode(35);
        tree.addNode(70);
        tree.addNode(65);
        tree.addNode(75);
        System.out.println("Searching For 70: "+tree.searchNode(70));
        System.out.println("Searching For 23: "+tree.searchNode(23));
        System.out.println("No. of Total Nodes is: "+tree.countOfNodes(tree.root));
        System.out.println("Height of Tree is: "+tree.height(tree.root));

        System.out.println("Maximum Value in Tree is: "+tree.maxFind(tree.root));
        System.out.println("Minimum Value in Tree is: "+tree.minFind(tree.root));

        System.out.println("Is tree Balanced? : "+tree.balanceCheck(tree.root));
    }
}