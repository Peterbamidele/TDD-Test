package com.company;

import org.junit.jupiter.api.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;
    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
        System.out.println("created");
    }

    @AfterEach
    void tearDown() {
        fizzBuzz = null;
    }

    @DisplayName("Play FizzBuzz with number = 1")
    @Test
    void testNumber() {
        String fizzBuzz = new FizzBuzz().play(1);
        Assertions.assertEquals(fizzBuzz, "1");

    }

    @DisplayName("Play FizzBuzz with number = 3")
    @Test
    void testFizz() {
        String fizzBuzz = new FizzBuzz().play(3);
        Assertions.assertEquals(fizzBuzz, "Fizz");
    }

    @DisplayName("Play FizzBuzz with number = 5")
    @Test
    void testBuzz() {
        String fizzBuzz = new FizzBuzz().play(5);
        Assertions.assertEquals(fizzBuzz, "Buzz");

    }

    @DisplayName("Don't Play FizzBuzz with number = 0")
    @Test
    void testZero() {
        Assertions.assertThrows(IllegalAccessException.class,
//            @Override
//            public void execute() throws Throwable{
                ()-> fizzBuzz.play(0));
            }
//        String fizzBuzz = new FizzBuzz().play(0);
//        Assertions.assertEquals(fizzBuzz, "Buzz");

    }