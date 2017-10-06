/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.computer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.util.Hashtable;
import java.util.Map;
import net.virtualinfinity.atrobots.arena.Odometer;
import net.virtualinfinity.atrobots.computer.Computer;
import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.HardwareBus;
import net.virtualinfinity.atrobots.computer.InterruptHandler;
import net.virtualinfinity.atrobots.computer.Memory;
import net.virtualinfinity.atrobots.computer.Resettable;
import net.virtualinfinity.atrobots.computer.Restartable;
import net.virtualinfinity.atrobots.computer.ShutdownListener;
import net.virtualinfinity.atrobots.hardware.heatsinks.HeatSinks;
import net.virtualinfinity.atrobots.hardware.throttle.Throttle;
import net.virtualinfinity.atrobots.measures.Heat;
import net.virtualinfinity.atrobots.ports.PortHandler;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HardwareBusEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      hardwareBus0.setPorts((Map<Integer, PortHandler>) null);
      assertEquals(350, hardwareBus0.getShutdownLevel());
  }

  @Test
  public void test1()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      hardwareBus0.getInterrupts();
      assertEquals(350, hardwareBus0.getShutdownLevel());
  }

  @Test
  public void test2()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      // Undeclared exception!
      try {
        hardwareBus0.callInterrupt((-17));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      hardwareBus0.getPorts();
      assertEquals(350, hardwareBus0.getShutdownLevel());
  }

  @Test
  public void test4()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      // Undeclared exception!
      try {
        hardwareBus0.writePort((-19), (short)61);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      Hashtable<Integer, InterruptHandler> hashtable0 = new Hashtable<Integer, InterruptHandler>();
      hardwareBus0.setInterrupts((Map<Integer, InterruptHandler>) hashtable0);
      assertEquals(350, hardwareBus0.getShutdownLevel());
  }

  @Test
  public void test6()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      Odometer odometer0 = new Odometer();
      hardwareBus0.addResetable((Resettable) odometer0);
      hardwareBus0.reset();
      assertEquals(350, hardwareBus0.getShutdownLevel());
  }

  @Test
  public void test7()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      // Undeclared exception!
      try {
        hardwareBus0.readPort((-1681));
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test8()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      int int0 = hardwareBus0.getShutdownLevel();
      assertEquals(350, int0);
  }

  @Test
  public void test9()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      hardwareBus0.reset();
      assertEquals(350, hardwareBus0.getShutdownLevel());
  }

  @Test
  public void test10()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      RobotScoreKeeper robotScoreKeeper0 = new RobotScoreKeeper();
      Robot robot0 = new Robot("s", 0, (RobotScore) robotScoreKeeper0);
      Memory memory0 = new Memory();
      Computer computer0 = new Computer(memory0, 0, 0, (DebugInfo) null);
      hardwareBus0.setAutoShutdownListener((Restartable) computer0);
      HeatSinks heatSinks0 = robot0.getHeatSinks();
      hardwareBus0.setHeat((Heat) heatSinks0);
      hardwareBus0.checkHeat();
      assertEquals(350, hardwareBus0.getShutdownLevel());
  }

  @Test
  public void test11()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      RobotScoreKeeper robotScoreKeeper0 = new RobotScoreKeeper();
      Robot robot0 = new Robot("s", 0, (RobotScore) robotScoreKeeper0);
      Memory memory0 = new Memory();
      Computer computer0 = new Computer(memory0, 0, 0, (DebugInfo) null);
      hardwareBus0.setAutoShutdownListener((Restartable) computer0);
      HeatSinks heatSinks0 = robot0.getHeatSinks();
      computer0.shutDown();
      hardwareBus0.setHeat((Heat) heatSinks0);
      hardwareBus0.checkHeat();
      assertEquals(350, hardwareBus0.getShutdownLevel());
  }

  @Test
  public void test12()  throws Throwable  {
      HardwareBus hardwareBus0 = new HardwareBus();
      assertEquals(350, hardwareBus0.getShutdownLevel());
      
      RobotScoreKeeper robotScoreKeeper0 = new RobotScoreKeeper();
      Robot robot0 = new Robot("", (-887), (RobotScore) robotScoreKeeper0);
      hardwareBus0.setShutdownLevel((-887));
      HeatSinks heatSinks0 = robot0.getHeatSinks();
      hardwareBus0.setHeat((Heat) heatSinks0);
      Throttle throttle0 = new Throttle((double) (-887));
      hardwareBus0.addShutdownListener((ShutdownListener) throttle0);
      // Undeclared exception!
      try {
        hardwareBus0.checkHeat();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
