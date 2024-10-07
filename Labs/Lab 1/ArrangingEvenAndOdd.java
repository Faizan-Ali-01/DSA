class ArrangingEvenAndOdd
{
    public static void main (String args[])
    {
        int arr[]={ 1,2,3,5,7,2,2,7,8,9};
        int arr1[]=new int[arr.length];
        int a=0;
        System.out.print("The Original Array is: ");
        
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                arr1[a]=arr[i];
                a++;
            }
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                arr1[a]=arr[i];
                a++;
            }
        }
        System.out.print("After Arrangement the Array is: ");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}