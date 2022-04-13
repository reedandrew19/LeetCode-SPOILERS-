package FibonacciNumber509;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    @Test
    public void test0Recursive (){
        assertEquals(0, FibonacciNumber.fibRecursive(0));
    }

    @Test
    public void test1Recursive(){
        assertEquals(1, FibonacciNumber.fibRecursive(1));
    }

    @Test
    public void test8Recursive(){
        assertEquals(13, FibonacciNumber.fibRecursive(7));
    }

    @Test
    public void test0Dynamic(){
        assertEquals(0, FibonacciNumber.fibDynamic(0));
    }

    @Test
    public void test1Dynamic(){
        assertEquals(1, FibonacciNumber.fibDynamic(1));
    }

    @Test
    public void test8Dynamic(){
        assertEquals(13, FibonacciNumber.fibDynamic(7));
    }
}