package by.itstep.vika.javalessons.lesson20.model.logic;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    //rule of AAA! правило 3х А

    @Test
    public void testSum(){
        //Arrange(подготовка)
        int a = 11;
        int b = 3;
        int expected = 14;

        // Action
        int actual = Calculator.sum(a,b);

        //Assert (опровержение)
        assertEquals(expected, actual);
    }
    @Test
    public void testSub(){
        //Arrange(подготовка)
        int a = 11;
        int b = 3;
        int expected = 8;

        // Action
        int actual = Calculator.sub(a,b);

        //Assert (опровержение)
        assertEquals(expected, actual);
    }

    @Test
    public void testMul(){
        //Arrange(подготовка)
        int a = 11;
        int b = 3;
        int expected = 33;

        // Action
        int actual = Calculator.mul(a,b);

        //Assert (опровержение)
        assertEquals(expected, actual);
    }
    @Test
    public void testDiv(){
        //Arrange(подготовка)
        int a = 11;
        int b = 3;
        int expected = 3;

        // Action
        int actual = Calculator.div(a,b);

        //Assert (опровержение)
        assertEquals(expected, actual);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivByZero(){
        //Arrange(подготовка)
        int a = 11;
        int b = 0;

        // Action
       Calculator.div(a,b);

        //Assert (опровержение)
    }
}
