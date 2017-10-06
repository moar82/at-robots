/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.hardware.armor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.hardware.armor.Armor;
import net.virtualinfinity.atrobots.hardware.armor.ArmorDepletionListener;
import net.virtualinfinity.atrobots.ports.PortHandler;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ArmorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Armor armor0 = new Armor(1871.7571377993659);
      PortHandler portHandler0 = armor0.getSensor();
      assertEquals(1871.7571377993659, armor0.getRemaining(), 0.01D);
      assertEquals(1872, portHandler0.read());
  }

  @Test
  public void test1()  throws Throwable  {
      Armor armor0 = new Armor(1871.7571377993659);
      armor0.inflictDamage((-238.87478223189822));
      assertEquals(2110.631920031264, armor0.getRemaining(), 0.01D);
  }

  @Test
  public void test2()  throws Throwable  {
      Armor armor0 = new Armor(1871.7571377993659);
      armor0.setArmorDepletionListener((ArmorDepletionListener) null);
      assertEquals(1871.7571377993659, armor0.getRemaining(), 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      Armor armor0 = new Armor(1871.7571377993659);
      assertEquals(1871.7571377993659, armor0.getRemaining(), 0.01D);
      
      // Undeclared exception!
      try {
        armor0.destruct();
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
