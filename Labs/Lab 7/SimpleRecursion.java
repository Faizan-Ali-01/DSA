class SimpleRecursion
{
    static void nNumbers(int n)
    {
        if(n<=0)
            return;
        else
        {
            System.out.print(n + " ");
            nNumbers(n-1);
            System.out.print(n + " ");
        }
    }

    static void arrByRecursion(int arr[],int n)
    {
        if(n <= 0)
            return;
        else
        {
            System.out.print(arr[n-1]+" ");
            arrByRecursion(arr,n-1);
            System.out.print(arr[n-1]+" ");
        }
    }

    public static void main(String[] args)
    {
        nNumbers(5);
        System.out.println();
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        arrByRecursion(arr,n);
    }
}