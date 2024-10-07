import java.util.Scanner;
class SearchingArray
{
    static void searchUsingIteration(int arr[],int search)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("Element is present at index "+i);
                return;
            }
        }
        System.out.println("Element not Found");
    }

    static void searchUsingRecursion(int arr[],int search,int index)
    {
        if(index==arr.length)
        {
            System.out.println("Element not Found");
            return;
        }
        if(arr[index]==search)
        {
            System.out.println("Element is present at index "+index);
            return;
        }
        searchUsingRecursion(arr,search,index+1);
    }

    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        long startTime,endTime;
        long iterativeTime,recursiveTime;
        int arr[]={1,2,3,4,5};
        System.out.print("Enter element to search: ");
        int search=in.nextInt();
        startTime=System.nanoTime();
        searchUsingIteration(arr,search);
        endTime=System.nanoTime();
        iterativeTime=endTime-startTime;

        startTime=System.nanoTime();
        searchUsingRecursion(arr, search, 0);
        endTime=System.nanoTime();
        recursiveTime=endTime-startTime;
        
        if(iterativeTime > recursiveTime)
            System.out.println("Recursive Method Takes less Time");
        else
            System.out.println("Iterative Method Takes less Time");
        in.close();
    }
}
