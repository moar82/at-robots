/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.computer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.computer.Computer;
import net.virtualinfinity.atrobots.computer.DecrementInstruction;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class DecrementInstructionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      DecrementInstruction decrementInstruction0 = new DecrementInstruction((-907));
      // Undeclared exception!
      try {
        decrementInstruction0.perform((Computer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
