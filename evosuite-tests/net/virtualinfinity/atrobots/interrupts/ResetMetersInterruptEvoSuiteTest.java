/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.interrupts;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.arena.Odometer;
import net.virtualinfinity.atrobots.computer.MemoryCell;
import net.virtualinfinity.atrobots.interrupts.ResetMetersInterrupt;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ResetMetersInterruptEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RobotScoreKeeper robotScoreKeeper0 = new RobotScoreKeeper();
      Robot robot0 = new Robot("+X-{<EA", (-1), (RobotScore) robotScoreKeeper0);
      Odometer odometer0 = robot0.getOdometer();
      ResetMetersInterrupt resetMetersInterrupt0 = new ResetMetersInterrupt((MemoryCell) null, odometer0);
      // Undeclared exception!
      try {
        resetMetersInterrupt0.handleInterrupt();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
