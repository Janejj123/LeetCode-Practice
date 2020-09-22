package practiceCode;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> {

    private ArrayList<E> fakeStack;
    private int size;

    public MyStack() {
         fakeStack = new ArrayList<>();
    }

    public int size() {
        for (int i = 0; i < fakeStack.size(); i++)  {
            size++;
        }
        return size;
    }

    public void push_back(E e) {
        fakeStack.add(e);
    }

    public E pop_back() throws EmptyStackException {
        if (fakeStack.isEmpty()) {
            throw new EmptyStackException();
        }
        E e = fakeStack.get(fakeStack.size()-1);
        fakeStack.remove(fakeStack.size()-1);

        return e;
    }

    public E peek() {
        E e = fakeStack.get(fakeStack.size()-1);
        return e;
    }

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push_back (1);
        stack.push_back (2);
        stack.push_back (3);
        System.out.println(stack.pop_back()); //output 3 System.out.println(stack.peek()); //output 2 System.out.println(stack.peek()); //output 2 System.out.println(stack.peek()); //output 2
        System.out.println(stack.pop_back());
        System.out.println(stack.pop_back());
        stack.push_back(1);
        stack.push_back (2);
        stack.push_back (3);
        System.out.println(stack.pop_back());
        stack.push_back (4);
        stack.push_back (5);
        System.out.println(stack.pop_back());
        System.out.println(stack.pop_back());
        System.out.println(stack.pop_back());
        System.out.println(stack.pop_back());
//output 2 //output 1
//output 3
//output 5 //output 4 //output 2 //output 1
    }


}

