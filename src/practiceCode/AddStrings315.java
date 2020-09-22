package practiceCode;

public class AddStrings315 {
    public static void main (String[] args) {
        String a = "3221";
        String b = "4321";

        AddStrings315 newObject = new AddStrings315();
        System.out.println(newObject.addStrings(a,b));
    }

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i=num1.length()-1, j=num2.length()-1; i>=0 || j>=0 || carry == 1; i--, j--) {
            int x = i<0 ? 0: num1.charAt(i) - '0';
            int y = j<0 ? 0: num2.charAt(i) - '0';
            sb.append((x+y+carry) % 10 );
            carry = (x + y + carry) / 10;
        }
        return sb.reverse().toString();
    }

}
