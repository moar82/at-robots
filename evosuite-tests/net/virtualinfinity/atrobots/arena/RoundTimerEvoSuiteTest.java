/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.arena;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.arena.RoundTimer;
import net.virtualinfinity.atrobots.measures.Duration;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class RoundTimerEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      RoundTimer roundTimer0 = new RoundTimer();
      Duration duration0 = Duration.ZERO_CYCLE;
      roundTimer0.increment(duration0);
      assertEquals("1s", duration0.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      RoundTimer roundTimer0 = new RoundTimer();
      Duration duration0 = roundTimer0.getTime();
      assertEquals("1s", duration0.toString());
  }
}
