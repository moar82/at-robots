/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.interrupts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.arena.Arena;
import net.virtualinfinity.atrobots.computer.Memory;
import net.virtualinfinity.atrobots.computer.MemoryCell;
import net.virtualinfinity.atrobots.interrupts.GetGameInfoInterrupt;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GetGameInfoInterruptEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Memory memory0 = new Memory();
      MemoryCell memoryCell0 = memory0.getCell((-158));
      GetGameInfoInterrupt getGameInfoInterrupt0 = new GetGameInfoInterrupt(memoryCell0, memoryCell0, memoryCell0, (-120), (-1035), (Arena) null);
      // Undeclared exception!
      try {
        getGameInfoInterrupt0.handleInterrupt();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
