/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.computer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.computer.Computer;
import net.virtualinfinity.atrobots.computer.ReadPortInstruction;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ReadPortInstructionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ReadPortInstruction readPortInstruction0 = new ReadPortInstruction((-907));
      // Undeclared exception!
      try {
        readPortInstruction0.perform((Computer) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
