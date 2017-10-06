/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.measures;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.measures.AbsoluteAngle;
import net.virtualinfinity.atrobots.measures.PolarVector;
import net.virtualinfinity.atrobots.measures.Vector;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class PolarVectorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromBygrees((-255));
      PolarVector polarVector0 = PolarVector.createPolar(absoluteAngle0, (-814.0304213208852));
      PolarVector polarVector1 = (PolarVector)polarVector0.projectOnto((Vector) polarVector0);
      assertNotNull(polarVector1);
      assertEquals("<1.5953400194010667r/129, 814.0304213208856>:<-19.977306594238307, 813.7852505772628>", polarVector1.toString());
  }

  @Test
  public void test1()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromRadians(8.210919342549543);
      PolarVector polarVector0 = PolarVector.createPolar(absoluteAngle0, 32.831454397338355);
      String string0 = polarVector0.toString();
      assertNotNull(string0);
      assertEquals("<1.9277340353699568r/143, 32.831454397338355>:<-11.471526761755317, 30.76212722811671>", string0);
  }
}
