/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.gui;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.Graphics;
import java.awt.HeadlessException;
import net.virtualinfinity.atrobots.gui.TestAccel;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class TestAccelEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      TestAccel testAccel0 = new TestAccel();
      // Undeclared exception!
      try {
        testAccel0.paintComponent((Graphics) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test1()  throws Throwable  {
      TestAccel testAccel0 = new TestAccel();
      // Undeclared exception!
      try {
        testAccel0.run();
        fail("Expecting exception: HeadlessException");
      } catch(HeadlessException e) {
      }
  }
}
