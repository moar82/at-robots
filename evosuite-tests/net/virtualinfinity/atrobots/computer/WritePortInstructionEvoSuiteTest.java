/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.computer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.computer.Computer;
import net.virtualinfinity.atrobots.computer.WritePortInstruction;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class WritePortInstructionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      WritePortInstruction writePortInstruction0 = new WritePortInstruction((-907));
      // Undeclared exception!
      try {
        writePortInstruction0.perform((Computer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
