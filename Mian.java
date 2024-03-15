import java.util.Scanner;

public class Mian{
    public static void main(String[] args) throws Exception{
        System.out.println("please enter an expression using only parentheses");
        Scanner reader = new Scanner(System.in);
        String expression = reader.nextLine();
        BalancedParentheses balance =new BalancedParentheses();
        balance.balancedParentheses(expression);
        reader.close();
    }
}