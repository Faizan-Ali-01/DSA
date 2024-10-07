import java.util.Stack;
class Postfix
{

    static int precedenceCheck(char ch)
    {
        switch(ch)
        {
            case '+','-':
                return 1;
            case '*','/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    static String conversionToPostfix(String input)
    {
        Stack<Character> stack = new Stack<>();
        String output = "";
        for(int i=0;i<input.length();i++)
        {
            char ch = input.charAt(i);
            if(Character.isLetterOrDigit(ch))
                output += ch;
            else
            {
                while(!stack.isEmpty() && precedenceCheck(ch) <= precedenceCheck(stack.peek()))
                {
                    output += stack.pop();
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty())
        {
            output += stack.pop();
        }
        return output;
    }

    public static void main(String[] args)
    {
        String input = "A+B*C+D";
        System.out.print(conversionToPostfix(input));
    }
}