/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.computer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.computer.Flags;
import net.virtualinfinity.atrobots.computer.Memory;
import net.virtualinfinity.atrobots.computer.MemoryCell;
import net.virtualinfinity.atrobots.computer.Registers;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RegistersEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getSp();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test1()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getBx();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test2()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getCommunicationQueueTail();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test3()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getCx();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test4()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getStackPointerCell();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test5()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getSwap();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test6()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getDx();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test7()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      Flags flags0 = registers0.getFlags();
      assertNotNull(flags0);
  }

  @Test
  public void test8()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getAccuracy();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test9()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      // Undeclared exception!
      try {
        registers0.toString();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test10()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getTargetId();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test11()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getDesiredSpeed();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test12()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getMeters();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test13()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getTargetVelocity();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test14()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getCollisionCount();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test15()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getTargetThrottle();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test16()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getCommunicationQueueHead();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test17()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getTargetHeading();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test18()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getFx();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test19()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getEx();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test20()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getTurretOffset();
      assertNotNull(memoryCell0);
  }

  @Test
  public void test21()  throws Throwable  {
      Memory memory0 = new Memory();
      Registers registers0 = new Registers(memory0);
      MemoryCell memoryCell0 = registers0.getDesiredHeading();
      assertNotNull(memoryCell0);
  }
}
