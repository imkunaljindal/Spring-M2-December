package com.example.TestingTutorial;

import org.junit.jupiter.api.*;

public class CalculatorTests {

    Calculator c = new Calculator();

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is executed before all the test cases");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("This is executed after all the test cases");
    }

    @BeforeEach
    public void beforeEveryTest() {
        System.out.println("This is executed before every test case");
    }

    @AfterEach
    public void afterEveryTest() {
        System.out.println("This is execute after every test");
    }

    @Test
    @DisplayName("This is a test case for ADD")
    public void testAdd_when_nums_are_positive() {
        System.out.println("Test 1");
        int x = 5;
        int y = 10;
        int expected = 15;
        int actual = c.add(5,10);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSubtract() {
        System.out.println("Test 2");
        int x = 10;
        int y = 5;
        int expected = 5;
        int actual = c.subtract(x,y);
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testIsEven_When_input_is_Even() {
        System.out.println("Test 3");
        int x = 10;
        boolean actual = c.isEven(x);
        Assertions.assertTrue(actual);
    }

    @Test
    public void testIsEven_When_input_is_Odd() {
        System.out.println("Test 4");
        int x = 11;
        boolean actual = c.isEven(x);
        Assertions.assertFalse(actual);
    }
}
