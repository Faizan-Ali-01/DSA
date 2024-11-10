import java.util.Stack;
import java.util.Scanner;
class Undo_Redo
{    
    Stack<String> undoStack = new Stack<String>();
    Stack<String> redoStack = new Stack<String>();

    void insert(String str)
    {
        undoStack.push(str);
        redoStack.clear();
        System.out.println("Inserted "+str);
    }
    void undo()
    {
        if(!undoStack.isEmpty())
        {
            String value=undoStack.pop();
            redoStack.push(value);
            System.out.println("Undone "+value);
        }
        else
        {
            System.out.println("Nothing to undo");
        }
    }
    void redo()
    {
        if(!redoStack.isEmpty())
        {
            String value=redoStack.pop();
            undoStack.push(value);
            System.out.println("Redone "+value);
        }
        else
        {
            System.out.println("Nothing to redo");
        }
    }
    void displayStack()
    {
        System.out.print("String is: ");
        if(!undoStack.isEmpty())
        {
            System.out.print(undoStack);
        }
        else
        {
            System.out.print("Nothing to display");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Undo_Redo obj = new Undo_Redo();
        Scanner in=new Scanner(System.in);
        boolean continueCheck=true;
        while(continueCheck)
        {
            System.out.print("Enter 1 for insert, 2 for undo, 3 for redo, 4 display stack, 5 to exit : ");
            int choice=in.nextInt();
            in.nextLine();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter something to insert: ");
                    String str=in.nextLine();
                    obj.insert(str);
                    break;
                case 2:
                    obj.undo();
                    break;
                case 3:
                    obj.redo();
                    break;
                case 4:
                    obj.displayStack();
                    break;
                case 5:
                    System.out.println("Exiting the Program.......");
                    continueCheck=false;
                    break;
                default:
                    System.out.println("Wrong Choice. Please Try Again");
                    break;

            }
        }
        in.close();
    }
}