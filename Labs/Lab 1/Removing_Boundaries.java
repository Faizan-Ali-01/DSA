class Removing_Boundaries
{
    int arr2D[][]={{1,2,3,4},{5,6,7,8},{9,1,2,3},{4,5,6,7}};
    void extractCenter(int arr2D[][])
    {
        System.out.println("The Array without Center Elements is: ");
        for(int i=0;i<arr2D.length;i++)
        {
            for(int j=0;j<arr2D[i].length;j++)
            {
                if(i==0 || j==0 || i==(arr2D.length-1) || j==(arr2D[i].length-1))
                {
                    System.out.print(arr2D[i][j] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
    }

    void extractBoundaries(int arr2D[][])
    {
        System.out.println();
        System.out.println("The Array without Boarder Elements is: ");
        for(int i=0;i<arr2D.length;i++)
        {
            for(int j=0;j<arr2D[i].length;j++)
            {
                if(i==0 || j==0 || i==(arr2D.length-1) || j==(arr2D[i].length-1))
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(arr2D[i][j]+" ");
                }
            }
            System.out.println();
        }
        
    }

    public static void main(String args[])
    {
        Removing_Boundaries obj=new Removing_Boundaries();
        obj.extractCenter(obj.arr2D);
        obj.extractBoundaries(obj.arr2D);
    }
}