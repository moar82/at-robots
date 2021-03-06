/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.robot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.measures.AbsoluteAngle;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScanResult;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RobotScanResultEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RobotScanResult robotScanResult0 = null;
      try {
        robotScanResult0 = new RobotScanResult((Robot) null, (double) 0, (AbsoluteAngle) null, 0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      RobotScanResult robotScanResult0 = new RobotScanResult();
      int int0 = robotScanResult0.getAccuracy();
      assertEquals(Double.POSITIVE_INFINITY, robotScanResult0.getDistance(), 0.01D);
      assertEquals(0, robotScanResult0.getThrottle());
      assertEquals(0, int0);
  }

  @Test
  public void test2()  throws Throwable  {
      RobotScanResult robotScanResult0 = new RobotScanResult();
      int int0 = robotScanResult0.getThrottle();
      assertEquals(Double.POSITIVE_INFINITY, robotScanResult0.getDistance(), 0.01D);
      assertEquals(0, robotScanResult0.getAccuracy());
      assertEquals(0, int0);
  }

  @Test
  public void test3()  throws Throwable  {
      RobotScanResult robotScanResult0 = new RobotScanResult();
      robotScanResult0.getHeading();
      assertEquals(0, robotScanResult0.getThrottle());
      assertEquals(0, robotScanResult0.getAccuracy());
      assertEquals(Double.POSITIVE_INFINITY, robotScanResult0.getDistance(), 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      RobotScanResult robotScanResult0 = new RobotScanResult();
      robotScanResult0.getAngle();
      assertEquals(0, robotScanResult0.getThrottle());
      assertEquals(0, robotScanResult0.getAccuracy());
      assertEquals(Double.POSITIVE_INFINITY, robotScanResult0.getDistance(), 0.01D);
  }

  @Test
  public void test5()  throws Throwable  {
      RobotScanResult robotScanResult0 = new RobotScanResult();
      double double0 = robotScanResult0.getDistance();
      assertEquals(0, robotScanResult0.getAccuracy());
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01D);
      assertEquals(0, robotScanResult0.getThrottle());
  }

  @Test
  public void test6()  throws Throwable  {
      RobotScanResult robotScanResult0 = new RobotScanResult();
      robotScanResult0.getMatch();
      assertEquals(0, robotScanResult0.getAccuracy());
      assertEquals(Double.POSITIVE_INFINITY, robotScanResult0.getDistance(), 0.01D);
      assertEquals(0, robotScanResult0.getThrottle());
  }

  @Test
  public void test7()  throws Throwable  {
      RobotScanResult robotScanResult0 = new RobotScanResult();
      robotScanResult0.getMatchPositionVector();
      assertEquals(false, robotScanResult0.successful());
      assertEquals(0, robotScanResult0.getAccuracy());
      assertEquals(0, robotScanResult0.getThrottle());
      assertEquals(Double.POSITIVE_INFINITY, robotScanResult0.getDistance(), 0.01D);
  }
}
