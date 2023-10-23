package Fib_lab1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Fib2Test {

    @Test

    void main() {
        int i = Fib2.fib2(13);
        System.out.println(i);
        Assertions.assertEquals(233,i);
    }
}