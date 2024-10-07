import java.util.Stack;
import java.util.Scanner;
class BracketCheck
{
    boolean balancedCheck(String input)
    {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<input.length();i++)
        {
            char current=input.charAt(i);
            if(current=='(' || current=='{' || current=='[')
                stack.push(current);
            else if(current==')' || current=='}' || current==']')
            {
                if(stack.isEmpty())
                    return false;
                else
                {
                    if(pair(stack.pop(),current))
                    continue;return true;
                }
            }
        }
        return stack.isEmpty();
    }

    boolean pair(char open ,char close)
    {
        return (open == '(' && close == ')'||
                open == '{' && close == '}'||
                open == '[' && close == ']');
    }

    public static void main(String args[])
    {
        BracketCheck bc = new BracketCheck();
        Scanner in=new Scanner(System.in);
        System.out.print("Enter an Expression: ");
        String input=in.nextLine();
        if(bc.balancedCheck(input))
            System.out.println("The Brackets are Balanced");
        else
            System.out.println("The Brackets are not Balanced");
        in.close();
    }
}