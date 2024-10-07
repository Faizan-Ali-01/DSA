class FirstSingleLetter
{
    static char frequencyCheck(String arr,int input)
    {
        int[] text=new int[26];
        for(int i=0;i<input;i++)
        {
            char ch=arr.charAt(i);
            text[ch -'a']++;
        }
        for(int i=0;i<input;i++)
        {
            char ch=arr.charAt(i);
            if(text[ch -'a']==1)
            {
                return ch;
            }
        }
        return '-';
    }
    public static void main(String args[])
    {
        String input="appropriate";
        char result=frequencyCheck(input,input.length());
        if(result!='-')
            System.out.println("The first occurence of a single letter is: "+result);
        else
            System.out.println("No single letter found");
    }
}