package part_2;

import java.util.Scanner;
import interfaces.Stack;

/**
 * Class to test the ResizingArrayStack and LinkedStack classes.
 *
 * @author Addison Farley
 * @version 1.0
 */
public class StackTestClient
{
    public static void main(String[] args)
    {
//        Stack<String> s = new ResizingArrayStack<>();
        Stack<String> s = new LinkedStack<>();

        Scanner in = new Scanner("to be or not to - be - - that - - - is");

        while(in.hasNext())
        {
            String item = in.next();

            if(!item.equals("-"))
            {
                s.push(item);
            }
            else if(!s.isEmpty())
            {
                System.out.println(s.pop() + " ");
            }
        }

        System.out.println("(" + s.size() + " left on the stack)");
    }
}
