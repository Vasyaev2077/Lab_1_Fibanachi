package Fib_lab1;

import java.util.HashMap;
import java.util.Map;
public class Fib3 {

    //Мемоизация — это метод, при котором сохраняются результаты выполненных вычислений

    static Map<Integer, Integer> memo = new HashMap<>(Map.of(0, 0, 1, 1));

    private static int fib3(int n) {
        if (!memo.containsKey(n)) {

            memo.put(n, fib3(n - 1) + fib3(n - 2));
        }
        return memo.get(n);
    }
    public static void main(String[] args) {
        System.out.println(fib3(5));
        System.out.println(fib3(40));
    }
}
