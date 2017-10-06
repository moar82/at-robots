/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.hardware.shield;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.hardware.heatsinks.HeatSinks;
import net.virtualinfinity.atrobots.hardware.shield.Shield;
import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.ports.PortHandler;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ShieldEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Shield shield0 = new Shield((-49.43813930497068));
      // Undeclared exception!
      try {
        shield0.reset();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      Shield shield0 = new Shield((-49.43813930497068));
      boolean boolean0 = shield0.isActive();
      assertEquals(false, boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      Shield shield0 = new Shield((-49.43813930497068));
      PortHandler portHandler0 = shield0.getLatch();
      assertEquals(0, portHandler0.read());
  }

  @Test
  public void test3()  throws Throwable  {
      Shield shield0 = new Shield((-49.43813930497068));
      HeatSinks heatSinks0 = new HeatSinks();
      shield0.setHeatSinks(heatSinks0);
      shield0.setActive(true);
      double double0 = shield0.absorbDamage((-49.43813930497068));
      assertEquals(true, shield0.isActive());
      assertEquals(2444.1296179376873, double0, 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      Shield shield0 = new Shield(13.19860505319162);
      // Undeclared exception!
      try {
        shield0.shutDown();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Shield shield0 = new Shield(13.19860505319162);
      double double0 = shield0.absorbDamage(13.19860505319162);
      assertEquals(13.19860505319162, double0, 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      Shield shield0 = new Shield(13.19860505319162);
      Duration duration0 = Duration.ONE_CYCLE;
      shield0.update(duration0);
      assertEquals(false, shield0.isActive());
  }

  @Test
  public void test7()  throws Throwable  {
      Shield shield0 = new Shield((-49.43813930497068));
      HeatSinks heatSinks0 = new HeatSinks();
      shield0.setHeatSinks(heatSinks0);
      shield0.setActive(true);
      shield0.update((Duration) null);
      assertEquals(true, shield0.isActive());
  }

  @Test
  public void test8()  throws Throwable  {
      Shield shield0 = new Shield(13.19860505319162);
      Duration duration0 = Duration.ONE_CYCLE;
      HeatSinks heatSinks0 = new HeatSinks();
      shield0.setHeatSinks(heatSinks0);
      shield0.setActive(true);
      shield0.update(duration0);
      assertEquals(true, shield0.isActive());
  }
}
