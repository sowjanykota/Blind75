package arrays.pracice;

import java.util.Stack;

public class StringBalancedBrackets {
    public static void main(String[] args) {
        String str = "{[()]}";
        char[] ch = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0 ; i < ch.length ; i++) {
            if(ch[i] == '{' || ch[i] == '[' || ch[i] == '('){
                stack.push(ch[i]);
            }
            //char top = stack.pop();
          if(stack.peek() == '(' && ch[i] == ')' ||
                    stack.peek() == '[' && ch[i] == ']'||
                    stack.peek() == '{' && ch[i] == '}') {
                stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            System.out.println("Not Balances");
        }
        else
            System.out.println("Balanced");

//        Stack<Character> stack1 = new Stack<>();
//        for (int i = 0 ; i < str.length() ; i++) {
//
//        }
    }
    public static void correctWay(String str) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Push opening brackets
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            // Closing brackets
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }

        // If stack is empty → all brackets matched
        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
