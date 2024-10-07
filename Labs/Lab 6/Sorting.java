class Sorting
{
    static void selectionSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int minIndex = i;
            for(int j=1;j<arr.length;j++)
            {
                if(arr[minIndex]>arr[j])
                    minIndex=j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    static void insertionSort(int arr[])
    {
        for(int i=1;i<arr.length;i++)
        {
            int min=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>min)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=min;
        }
    }

    static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args)
    {
        int arr[]={6,5,4,3,2,1};
        // selectionSort(arr);
        // System.out.println("The Array sorterd by selection sort is: ");
        // print(arr);
        insertionSort(arr);
        System.out.println("The array Sorted by Insertion sort is: ");
        print(arr);
    }
}