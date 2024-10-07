class FibonacciSeries
{
    static void iterativeFabo(int range)
    {
        int a=0;
        int b=1;
        System.out.println("Fibonacci Series up to "+range+" is: ");
        System.out.print(a+" "+b+" ");
        for(int i=1;i<=range-2;i++)
        {
            int next=a+b;
            a=b;
            b=next;
            System.out.print(next+" ");
        }
        System.out.println();
    }
    static int RecursiveFabo(int n)
    {
        if(n<2)
            return n;
        else
        {
            return RecursiveFabo(n-1)+RecursiveFabo(n-2);
        }
    }
    public static void main(String args[])
    {
        long startTime,endTime;
        long iterativeTime,recursiveTime;
        int n=30;

        startTime=System.nanoTime();
        iterativeFabo(n);
        endTime=System.nanoTime();
        iterativeTime=endTime-startTime;

        RecursiveFabo(n);

        System.out.println("Fibonacci Series upto "+ n +" is: ");
        
        startTime=System.nanoTime();
        for(int i=0;i<n;i++)
        {
            System.out.print(RecursiveFabo(i)+" ");
        }
        endTime=System.nanoTime();
        recursiveTime=endTime-startTime;
        
        System.out.println();
        if(iterativeTime > recursiveTime)
            System.out.println("Recursive Method Takes less Time");
        else
            System.out.println("Iterative Method Takes less Time");
    }
}