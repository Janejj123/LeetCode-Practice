package practiceCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MultiThread {
    static class RunnableOne implements Runnable {

        private Integer num;
        public RunnableOne(Integer num) {
            this.num = num;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello world runOne " + num--);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class RunnableTwo implements Runnable {

        private Integer num;
        public RunnableTwo(Integer num) {
            this.num = num;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello world runTwo " + num++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    void useGeneric(List<? extends Number> arg) {

    }

    public static void main(String[] args) {
//        Integer a = 0;
//        Thread one = new Thread(new RunnableOne(a));
//        Thread two = new Thread(new RunnableTwo(a));
//
//        one.start();
//        two.start();
//
//        try {
//            one.join();
//            two.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        List<Integer> list = new ArrayList<>();
        Set<String> set = new HashSet<>();
        set.add("a");
        try {
            list.removeAll(set);
        } catch (Exception e) {
            System.out.println("exception happens " + e.getMessage());
        }
    }
}
