/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.computer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.computer.RandomAccessMemoryArray;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RandomAccessMemoryArrayEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RandomAccessMemoryArray randomAccessMemoryArray0 = new RandomAccessMemoryArray(2011);
      randomAccessMemoryArray0.or(486, (short) (-1));
      assertEquals(2011, randomAccessMemoryArray0.size());
  }

  @Test
  public void test1()  throws Throwable  {
      RandomAccessMemoryArray randomAccessMemoryArray0 = new RandomAccessMemoryArray(255);
      // Undeclared exception!
      try {
        randomAccessMemoryArray0.increment((-1766));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -1766
         */
      }
  }

  @Test
  public void test2()  throws Throwable  {
      RandomAccessMemoryArray randomAccessMemoryArray0 = new RandomAccessMemoryArray(0);
      randomAccessMemoryArray0.clear();
      assertEquals(0, randomAccessMemoryArray0.size());
  }

  @Test
  public void test3()  throws Throwable  {
      RandomAccessMemoryArray randomAccessMemoryArray0 = new RandomAccessMemoryArray(2011);
      // Undeclared exception!
      try {
        randomAccessMemoryArray0.decrement((-1676));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      } catch(ArrayIndexOutOfBoundsException e) {
        /*
         * -1676
         */
      }
  }

  @Test
  public void test4()  throws Throwable  {
      RandomAccessMemoryArray randomAccessMemoryArray0 = new RandomAccessMemoryArray(2011);
      randomAccessMemoryArray0.and(486, (short) (-1));
      assertEquals(2011, randomAccessMemoryArray0.size());
  }

  @Test
  public void test5()  throws Throwable  {
      RandomAccessMemoryArray randomAccessMemoryArray0 = new RandomAccessMemoryArray(634);
      randomAccessMemoryArray0.put(255, (short)1);
      assertEquals(634, randomAccessMemoryArray0.size());
  }
}
