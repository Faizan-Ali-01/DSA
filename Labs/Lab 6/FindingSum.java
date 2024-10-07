import java.util.Scanner;
import java.util.Arrays;
class FindingSum
{
    static void sumFinder(int arr[],int result)
    {
        Arrays.sort(arr);
        int left=0;
        int right=arr.length-1;
        while(left < right)
        {
            int currentSum=arr[left]+arr[right];
            if(currentSum==result)
            {
                System.out.println("I found two numbers "+arr[left]+" and "+arr[right]+" whose Sum equals to: "+result);
                return;
            }
            else if(currentSum < result)
                left++;
            else
                right--;
        }
        System.out.println("Did not found the numbers whose sum is equal to: "+result);
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int arr[]={6,5,4,3,2,1};
        System.out.print("Enter the number you want to Find: ");
        int sum=in.nextInt();
        sumFinder(arr,sum);
        in.close();
    }
}