/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.interrupts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.computer.MemoryCell;
import net.virtualinfinity.atrobots.hardware.transponder.Transponder;
import net.virtualinfinity.atrobots.interrupts.GetIdInterrupt;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GetIdInterruptEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Transponder transponder0 = new Transponder();
      GetIdInterrupt getIdInterrupt0 = new GetIdInterrupt(transponder0, (MemoryCell) null);
      // Undeclared exception!
      try {
        getIdInterrupt0.handleInterrupt();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
