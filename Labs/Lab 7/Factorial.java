import java.util.Scanner;
class Factorial
{
    static void iterativeFact(int range)
    {
        int fact=1;
        if(range==0)
            return;
        else
        {
            for(int i=1;i<=range;i++)
            {
                fact*=i;
            }
            System.out.println("Factorial of "+range+" is: "+fact);
        }
    }

    static int recursiveFabo(int n)
    {
        if(n<=0)
            return 1;
        else
        {
            return n*recursiveFabo(n-1);
        }
    }

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number you want to calculate factorial of: ");
        int n=in.nextInt();

        long startTime,endTime;
        long iterativeTime,recursiveTime;

        startTime=System.nanoTime();
        iterativeFact(n);
        endTime=System.nanoTime();
        iterativeTime=endTime-startTime;

        startTime=System.nanoTime();
        int result=recursiveFabo(n);
        endTime=System.nanoTime();
        recursiveTime=endTime-startTime;

        System.out.println("Factorial of "+n+" is: "+result);

        if(iterativeTime>recursiveTime) 
            System.out.println("Recursive Method is Better");
        else
            System.out.println("Iterative Method is Better");
        in.close();
    }
}