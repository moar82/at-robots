/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.computer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.computer.Memory;
import net.virtualinfinity.atrobots.computer.MemoryCell;
import net.virtualinfinity.atrobots.computer.MemoryRegion;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MemoryRegionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryRegion memoryRegion0 = new MemoryRegion(memory0, (-1), 255);
      // Undeclared exception!
      try {
        memoryRegion0.set((-1624), (short)434);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryRegion memoryRegion0 = new MemoryRegion(memory0, 246, 1658);
      int int0 = memoryRegion0.size();
      assertEquals((-246), int0);
  }

  @Test
  public void test2()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryRegion memoryRegion0 = new MemoryRegion(memory0, 8, 8);
      // Undeclared exception!
      try {
        memoryRegion0.get(1672);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryRegion memoryRegion0 = new MemoryRegion(memory0, (-1159), 246);
      // Undeclared exception!
      try {
        memoryRegion0.get(0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test4()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryRegion memoryRegion0 = new MemoryRegion(memory0, (-1533), (-1533));
      // Undeclared exception!
      try {
        memoryRegion0.unsigned((-1533));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryRegion memoryRegion0 = new MemoryRegion(memory0, (-5), 1);
      // Undeclared exception!
      try {
        memoryRegion0.unsigned(0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test6()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryRegion memoryRegion0 = new MemoryRegion(memory0, (-5), 1);
      // Undeclared exception!
      try {
        memoryRegion0.set(0, (short)0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test7()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryRegion memoryRegion0 = new MemoryRegion(memory0, 1076, 1076);
      // Undeclared exception!
      try {
        memoryRegion0.getCell((-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      } catch(IndexOutOfBoundsException e) {
        /*
         * -1
         */
      }
  }

  @Test
  public void test8()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryRegion memoryRegion0 = new MemoryRegion(memory0, (-1), 255);
      MemoryCell memoryCell0 = memoryRegion0.getCell(0);
      assertEquals(1, memoryRegion0.size());
      assertNotNull(memoryCell0);
  }
}
