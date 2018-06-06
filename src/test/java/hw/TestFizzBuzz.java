 package hw;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestFizzBuzz {

  private FizzBuzz fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new FizzBuzz();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }
    @Test
    public void StringArrayTest() {
        String fbArrayexpected [] = {"1",
                "2",
                "fizz",
                "4",
                "buzz",
                "fizz",
                "7",
                "8",
                "fizz",
                "buzz",
                "11",
                "fizz",
                "13",
                "14",
                "fizzbuzz",
                "16",
                "17"};
        assertEquals(fbArrayexpected, FizzBuzz.fizzbuzz(17));

    }

    @Test
    public void NegativeTenStringArrayTest() {
        String fbArrayexpected [] = {"Please enter a posive integer"};
        assertEquals(fbArrayexpected, FizzBuzz.fizzbuzz(-10));

    }

    @Test
    public void NegativeOneStringArrayTest() {
        String fbArrayexpected [] = {"Please enter a posive integer"};
        assertEquals(fbArrayexpected, FizzBuzz.fizzbuzz(-1));

    }

    @Test
    public void zeroStringArrayTest() {
        String fbArrayexpected [] = {};
        assertEquals(fbArrayexpected, FizzBuzz.fizzbuzz(0));

    }

    @Test
    public void oneStringArrayTest() {
        String fbArrayexpected [] = {"1"};
        assertEquals(fbArrayexpected, FizzBuzz.fizzbuzz(1));

    }

    @Test
    public void sevenStringArrayTest() {
        String fbArrayexpected [] = {"1",
                "2",
                "fizz",
                "4",
                "buzz",
                "fizz",
                "7"};
        assertEquals(fbArrayexpected, FizzBuzz.fizzbuzz(7));

    }





}
