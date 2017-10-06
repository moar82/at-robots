/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.hardware.heatsinks;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.hardware.heatsinks.HeatSinks;
import net.virtualinfinity.atrobots.measures.Temperature;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class HeatSinksEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      HeatSinks heatSinks0 = new HeatSinks();
      Temperature temperature0 = heatSinks0.getTemperature();
      heatSinks0.cool(temperature0);
      assertEquals(0.0, temperature0.getLogScale(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      HeatSinks heatSinks0 = new HeatSinks();
      heatSinks0.setCoolMultiplier(1978.5144624707439);
  }

  @Test
  public void test2()  throws Throwable  {
      HeatSinks heatSinks0 = new HeatSinks();
      Temperature temperature0 = heatSinks0.getTemperature();
      heatSinks0.warm(temperature0);
      assertEquals(0.0, temperature0.getLogScale(), 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      HeatSinks heatSinks0 = new HeatSinks();
      Temperature temperature0 = heatSinks0.getTemperature();
      heatSinks0.blockHeat(true);
      heatSinks0.cool(temperature0);
      assertEquals(0.0, temperature0.getLogScale(), 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      HeatSinks heatSinks0 = new HeatSinks();
      Temperature temperature0 = new Temperature(1.0);
      heatSinks0.cool(temperature0);
      assertEquals(1.0, temperature0.getLogScale(), 0.01D);
  }
}
