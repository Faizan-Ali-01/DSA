import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadingFile
{
    static String[] wordTokenize(String Filename)
{
    String words[]=new String[600];
    String sentence[];
    int count=0;

    try(BufferedReader br=new BufferedReader(new FileReader(Filename)))
    {
        String line;
        while((line=br.readLine()) != null)
        {
            sentence=line.split("[,\\.;\\(\\)\\[\\]{}!?\\s\\:]+");
            for(int i=0;i<sentence.length;i++)
            {
                if(!sentence[i].isEmpty())
                {
                    words[count++]=sentence[i];
                }
            }
        }
        System.out.print("The Tokenized text is: ");
        for(int i=0;i<count;i++)
        {
            System.out.print(words[i]+" ");
        }
        return words;
    }
    catch(IOException e)
    {
        e.printStackTrace();
        return null;
    }
}
    public static void main (String args[])
    {
        String Filename="sample1_words.txt";
        wordTokenize(Filename);

    }
}