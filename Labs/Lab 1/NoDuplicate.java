class NoDuplicate
{
    int arr2D[][]={{1,2,3,4,5},{6,7,8,9,10},{1,2,3,4,5},{6,7,8,9,10}};
    int arr1D[]=new int[20];
    int size=0;

    int[] noDup(int arr2D[][])
    {
        for(int i=0;i<arr2D.length;i++)
        {
            for(int j=0;j<arr2D[i].length;j++)
            {
                int value=arr2D[i][j];
                if(checkingArray(arr1D,value))
                {
                    arr1D[size]=value;
                    size++;
                }
            }
        } 
        return arr1D;
    }
        boolean checkingArray(int[] arr1D,int value)
        {
            for(int i=0;i<arr1D.length;i++)
            {
                if(arr1D[i]==value)
                {
                    return false;
                }
            }

            return true;
        }
    public static void main (String args[])
    {
        NoDuplicate noDupObj=new NoDuplicate();
        int answer[]=noDupObj.noDup(noDupObj.arr2D);

        System.out.print("The Original Array is: ");
        for(int i=0;i<noDupObj.arr2D.length;i++)
        {
            for(int j=0;j<noDupObj.arr2D[i].length;j++)
            {
                System.out.print(noDupObj.arr2D[i][j]+" ");
            }
        }

        System.out.print("\nThe New Array is: ");
        for(int i=0;i<noDupObj.size;i++)
        {
            System.out.print(answer[i]+" ");
        }
    }
}