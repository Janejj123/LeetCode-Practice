package practiceCode.nestediterator;


import java.util.*;

public class FlattenNestedListIterator341 implements Iterator<Integer> {

    Stack<NestedInteger> stack = new Stack<>();

    public FlattenNestedListIterator341(List<NestedInteger> nestedList) {
        for(int i = nestedList.size() - 1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while(!stack.isEmpty()) {
            NestedInteger curr = stack.peek();
            if(curr.isInteger()) {
                return true;
            }
            stack.pop();
            for(int i = curr.getList().size() - 1; i >= 0; i--) {
                stack.push(curr.getList().get(i));
            }
        }
        return false;
    }

    private void input (String input) {
        Stack<NestedInteger> stack = new Stack <>();

        int num = 0;
        NestedInteger current = new NestedIntegerImp(new ArrayList<>(), null);

        for (int i = 0; i <= input.length()-1; i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                num += num * 10 + (int) c - '0';
            }
            else if (c == ',') {
                if (Character.isDigit(input.charAt(i-1))) {
                    NestedInteger nestInt = new NestedIntegerImp(null, num);
                } else {
                    NestedInteger nestInt = new NestedIntegerImp(null, null);
                }
            }
            else if (c == '[') {
                NestedInteger nestInt = new NestedIntegerImp(new ArrayList<>(), null);
                current.getList().add(nestInt);
                stack.push(current);
                current = nestInt;
            }
            else if (c == ']') {

            }


        }
    }

    public static void main(String[] args) {
        NestedInteger value_6 = new NestedIntegerImp(null,6);
        NestedInteger list_6 = new NestedIntegerImp(
                Arrays.asList(new NestedInteger[] {value_6}), null);
        NestedInteger value_4 = new NestedIntegerImp(null,4);
        NestedInteger list_4_6 = new NestedIntegerImp(
                Arrays.asList(new NestedInteger[]{value_4, list_6})
                ,null);
        NestedInteger value_1 = new NestedIntegerImp(null,1);
        List<NestedInteger> origList = Arrays.asList(new NestedInteger[]{value_1, list_4_6});


        FlattenNestedListIterator341 iterator341 = new FlattenNestedListIterator341(origList);
        while (iterator341.hasNext()) {
            System.out.println("next value is " + iterator341.next());
        }

    }
}
