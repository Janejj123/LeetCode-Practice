package practiceCode;

import java.util.Stack;

public class BasicCalculator224 {

    public static void main(String[] args) {
        BasicCalculator224 testing = new BasicCalculator224();
        int res = testing.calculate("(3+2) + 5");
        System.out.println(res);
    }

    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int number = 0;
        int result = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(Character.isDigit(c)) {
                number = 10 * number + (int)(c - '0');
            } else if (c == '+') {
                result += sign * number;
                number = 0;
                sign = 1;
            } else if (c == '-') {
                result += sign * number;
                number = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(result);
                stack.push(sign); //sign for result in new ()
                result = 0;
                sign = 1; //sign for first number in ()
            } else if (c == ')') {
                result += sign * number;
                number = 0;
                result *= stack.pop(); //sign for the whole ()
                result += stack.pop(); //add result saved outside of ()
            }
        }
        if (number != 0) result += sign * number;
        return result;
    }
}
