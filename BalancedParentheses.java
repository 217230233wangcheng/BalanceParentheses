import java.util.Stack;

public class BalancedParentheses{
    Stack<Character> stack= new Stack<>();
    private boolean isBalanced;

    public void balancedParentheses(String expression){
        for(char bracket:expression.toCharArray()){
            if(bracket =='{'||bracket == '('||bracket == '['){
                stack.push(bracket);
            }else if(bracket == '}' || bracket == ')' || bracket ==']'){
                if(stack.isEmpty()||!isItBalanced(stack.pop(),bracket)){
                    System.out.println("the expresion is not balanced");
                    return;
                }
            }
        }
        System.out.println("The ecpression is balanced");
    }
    public boolean isItBalanced(char open,char close){
        //boolean isBalanced=false;
         if (open == '{' && close =='}'){
             return true;
         }else if(open == '(' && close ==')'){
            return true;
         }else if(open == '[' && close ==']'){
             return true; 
         }
         return isBalanced;

    }
}