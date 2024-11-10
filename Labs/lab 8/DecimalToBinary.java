class DecimalToBinary
{
    String binary= "";
    String decToBinary(int n)
    {
        if(n<=1)
        {
            binary+=n;
            return binary;
        }
        else
        {
            decToBinary(n/2);
            return binary+=n%2;
        }
    }

    public static void main(String args[])
    {
        DecimalToBinary obj=new DecimalToBinary();
        int n=13;
        System.out.println("Binar of "+ n +" is: "+obj.decToBinary(n));

    }
}