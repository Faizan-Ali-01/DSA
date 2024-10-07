import java.util.Arrays;
class QuickSort
{

    static int splitArray(int arr[],int min,int max)
    {
        int pivot = arr[max];
        int i=min-1;
        for(int j=min;j<max;j++)
        {
            if(arr[j]<=pivot)
            {
                i++;

                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1]=arr[max];
        arr[max]=temp;

        return i+1;
    }

    static void quickSort(int arr[],int min,int max)
    {
        if(min < max)
        {
            int splitIndex=splitArray(arr,min,max);
            quickSort(arr,min,splitIndex-1);
            quickSort(arr,splitIndex+1,max);
        }
    }

    public static void main(String args[])
    {
        int arr[]={5,4,3,2,1};
        System.out.println("Original Array is: "+Arrays.toString(arr));

        quickSort(arr,0,arr.length-1);
        System.out.println("Sorted Array is: "+Arrays.toString(arr));
    }
}