/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.compiler;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import net.virtualinfinity.atrobots.arena.Arena;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.compiler.HardwareSpecification;
import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import net.virtualinfinity.atrobots.game.StandardRoundState;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RobotFactoryEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      short[] shortArray0 = new short[9];
      Program program0 = new Program(shortArray0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HardwareSpecification hardwareSpecification0 = new HardwareSpecification((Map<String, Integer>) hashMap0);
      DebugInfo debugInfo0 = new DebugInfo();
      RobotFactory robotFactory0 = new RobotFactory("TL5yY%U2<", program0, hardwareSpecification0, debugInfo0, (int) (short)0, "TL5yY%U2<");
      String string0 = robotFactory0.getName();
      assertEquals("TL5yY%U2<", string0);
  }

  @Test
  public void test1()  throws Throwable  {
      short[] shortArray0 = new short[9];
      Program program0 = new Program(shortArray0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HardwareSpecification hardwareSpecification0 = new HardwareSpecification((Map<String, Integer>) hashMap0);
      DebugInfo debugInfo0 = new DebugInfo();
      RobotFactory robotFactory0 = new RobotFactory("TL5yY%U2<", program0, hardwareSpecification0, debugInfo0, (int) (short)0, "TL5yY%U2<");
      String string0 = robotFactory0.toString();
      assertEquals("RobotFactory{name='TL5yY%U2<'}", string0);
      assertNotNull(string0);
  }

  @Test
  public void test2()  throws Throwable  {
      short[] shortArray0 = new short[9];
      Program program0 = new Program(shortArray0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HardwareSpecification hardwareSpecification0 = new HardwareSpecification((Map<String, Integer>) hashMap0);
      DebugInfo debugInfo0 = new DebugInfo();
      RobotFactory robotFactory0 = new RobotFactory("TL5yY%U2<", program0, hardwareSpecification0, debugInfo0, (int) (short)0, "TL5yY%U2<");
      StandardRoundState standardRoundState0 = new StandardRoundState((int) (short)1825, (int) (short)0);
      RobotScoreKeeper robotScoreKeeper0 = new RobotScoreKeeper();
      // Undeclared exception!
      try {
        robotFactory0.createRobot((RoundState) standardRoundState0, (int) (short)1825, robotScoreKeeper0, (Arena) null, (int) (short)1825);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      short[] shortArray0 = new short[9];
      Program program0 = new Program(shortArray0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HardwareSpecification hardwareSpecification0 = new HardwareSpecification((Map<String, Integer>) hashMap0);
      DebugInfo debugInfo0 = new DebugInfo();
      RobotFactory robotFactory0 = new RobotFactory("TL5yY%U2<", program0, hardwareSpecification0, debugInfo0, (int) (short)0, "TL5yY%U2<");
      RobotFactory robotFactory1 = robotFactory0.setDebug(false);
      assertSame(robotFactory0, robotFactory1);
  }
}
