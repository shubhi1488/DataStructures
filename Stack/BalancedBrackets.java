//program to check whether the brackets are balanced or not...............
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BalancedBrackets {
    static boolean BalanceBracket(String exp){
        Deque<Character>stack=new ArrayDeque<>();
        for(int i=0;i<exp.length();i++){
            char x=exp.charAt(i);
            if(x=='(' || x=='{' || x=='['){
                stack.push(x);
                continue;
            }
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String expr =s.next();

        // Function call
        if (BalanceBracket(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }

        }
