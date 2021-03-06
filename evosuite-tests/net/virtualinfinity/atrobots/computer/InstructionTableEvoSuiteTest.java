/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.computer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.computer.AddInstruction;
import net.virtualinfinity.atrobots.computer.InstructionTable;
import net.virtualinfinity.atrobots.computer.InvalidMicrocodeInstruction;
import net.virtualinfinity.atrobots.computer.NoOperationInstruction;
import net.virtualinfinity.atrobots.computer.UnknownInstruction;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class InstructionTableEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      InstructionTable instructionTable0 = new InstructionTable();
      NoOperationInstruction noOperationInstruction0 = (NoOperationInstruction)instructionTable0.getNumberedLabelInstruction();
      assertNotNull(noOperationInstruction0);
  }

  @Test
  public void test1()  throws Throwable  {
      InstructionTable instructionTable0 = new InstructionTable();
      InvalidMicrocodeInstruction invalidMicrocodeInstruction0 = (InvalidMicrocodeInstruction)instructionTable0.getInvalidMicrocodeInstruction();
      assertNotNull(invalidMicrocodeInstruction0);
  }

  @Test
  public void test2()  throws Throwable  {
      InstructionTable instructionTable0 = new InstructionTable();
      UnknownInstruction unknownInstruction0 = (UnknownInstruction)instructionTable0.getInstruction((short) (-1147));
      assertNotNull(unknownInstruction0);
  }

  @Test
  public void test3()  throws Throwable  {
      InstructionTable instructionTable0 = new InstructionTable();
      AddInstruction addInstruction0 = (AddInstruction)instructionTable0.getInstruction((short)1);
      assertNotNull(addInstruction0);
  }

  @Test
  public void test4()  throws Throwable  {
      InstructionTable instructionTable0 = new InstructionTable();
      UnknownInstruction unknownInstruction0 = (UnknownInstruction)instructionTable0.getInstruction((short)643);
      assertNotNull(unknownInstruction0);
  }
}
