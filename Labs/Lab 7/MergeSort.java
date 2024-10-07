import java.util.Arrays;
class MergeSort
{

    static void merge(int arr[],int left,int mid,int right)
    {
        int s1=mid-left+1;
        int s2=right-mid;
        int tempArr1[]=new int[s1];
        int tempArr2[]=new int[s2];
        int i=0,j=0;
        int k=left;

        System.arraycopy(arr,left,tempArr1,0,s1);
        System.arraycopy(arr,mid+1,tempArr2,0,s2);

        while(i<s1 && j<s2)
        {
            if(tempArr1[i]<tempArr2[j])
            {
                arr[k]=tempArr1[i];
                i++;
            }
            else
            {
                arr[k]=tempArr2[j];
                j++;
            }
            k++;
        }
        while(i<s1)
        {
            arr[k]=tempArr1[i];
            i++;
            k++;
        }
        while(j<s2)
        {
            arr[k]=tempArr2[j];
            j++;
            k++;
        }
    }

    static void splitArray(int arr[],int left,int right)
    {
        if(left < right)
        {
            int mid=(left+right)/2;

            splitArray(arr,left,mid);
            splitArray(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    public static void main(String args[])
    {
        int arr[]={5,4,3,2,1};
        System.out.println("Original Array: "+Arrays.toString(arr));
        splitArray(arr,0,arr.length-1);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
    }
}