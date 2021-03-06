/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.measures;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import net.virtualinfinity.atrobots.measures.AbsoluteAngle;
import net.virtualinfinity.atrobots.measures.AngleBracket;
import net.virtualinfinity.atrobots.measures.RelativeAngle;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class AngleBracketEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian(1.0, 1.0);
      AngleBracket angleBracket0 = AngleBracket.between(absoluteAngle0, absoluteAngle0);
      Arc2D.Double arc2D_Double0 = (Arc2D.Double)angleBracket0.toShape(542.5697309282872, 423.2243962017909, 0.0);
      assertEquals(542.5697309282872, arc2D_Double0.x, 0.01D);
      assertEquals(2, arc2D_Double0.getArcType());
      assertEquals(423.2243962017909, arc2D_Double0.y, 0.01D);
      assertEquals(0.0, arc2D_Double0.height, 0.01D);
      assertNotNull(arc2D_Double0);
      assertEquals((-45.0), arc2D_Double0.start, 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian(0.0, 0.0);
      RelativeAngle relativeAngle0 = RelativeAngle.HALF_CIRCLE;
      AngleBracket angleBracket0 = AngleBracket.clockwiseFrom(absoluteAngle0, relativeAngle0);
      AngleBracket angleBracket1 = angleBracket0.subrange(0.0, 1.0);
      assertFalse(angleBracket0.equals(angleBracket1));
  }

  @Test
  public void test2()  throws Throwable  {
      AngleBracket angleBracket0 = AngleBracket.all();
      Ellipse2D.Double ellipse2D_Double0 = (Ellipse2D.Double)angleBracket0.toShape((-1152.9590831654955), (-1152.9590831654955), (-1152.9590831654955));
      assertEquals(2305.918166330991, ellipse2D_Double0.height, 0.01D);
      assertEquals(2305.918166330991, ellipse2D_Double0.width, 0.01D);
  }

  @Test
  public void test3()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian(1011.8551557612594, 1011.8551557612594);
      RelativeAngle relativeAngle0 = RelativeAngle.FULL_CIRCLE;
      AngleBracket angleBracket0 = AngleBracket.around(absoluteAngle0, relativeAngle0);
      assertNotNull(angleBracket0);
  }

  @Test
  public void test4()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian(1011.8551557612594, 1011.8551557612594);
      RelativeAngle relativeAngle0 = RelativeAngle.FULL_CIRCLE;
      AngleBracket angleBracket0 = AngleBracket.clockwiseFrom(absoluteAngle0, relativeAngle0);
      // Undeclared exception!
      try {
        angleBracket0.fractionTo((AbsoluteAngle) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian(0.0, 0.0);
      RelativeAngle relativeAngle0 = RelativeAngle.HALF_CIRCLE;
      AngleBracket angleBracket0 = AngleBracket.clockwiseFrom(absoluteAngle0, relativeAngle0);
      AbsoluteAngle absoluteAngle1 = angleBracket0.randomAngleBetween();
      assertNotNull(absoluteAngle1);
      assertEquals(3.9297527486720667, absoluteAngle1.getRadians(), 0.01D);
  }

  @Test
  public void test6()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromBygrees(242);
      AngleBracket angleBracket0 = AngleBracket.between(absoluteAngle0, absoluteAngle0);
      AbsoluteAngle absoluteAngle1 = angleBracket0.getCounterClockwiseBound();
      assertEquals(250.3125, absoluteAngle1.getDegrees(), 0.01D);
  }

  @Test
  public void test7()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromBygrees(242);
      AngleBracket angleBracket0 = AngleBracket.all();
      boolean boolean0 = angleBracket0.contains(absoluteAngle0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test8()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromBygrees(242);
      AbsoluteAngle absoluteAngle1 = absoluteAngle0.getSupplementary();
      AngleBracket angleBracket0 = AngleBracket.between(absoluteAngle0, absoluteAngle0);
      boolean boolean0 = angleBracket0.contains(absoluteAngle1);
      assertEquals(false, boolean0);
  }

  @Test
  public void test9()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromBygrees(242);
      AngleBracket angleBracket0 = AngleBracket.between(absoluteAngle0, absoluteAngle0);
      boolean boolean0 = angleBracket0.contains(absoluteAngle0);
      assertEquals(true, boolean0);
  }

  @Test
  public void test10()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian(0.0, 0.0);
      RelativeAngle relativeAngle0 = RelativeAngle.HALF_CIRCLE;
      AngleBracket angleBracket0 = AngleBracket.clockwiseFrom(absoluteAngle0, relativeAngle0);
      AbsoluteAngle absoluteAngle1 = angleBracket0.getClockwiseBound();
      assertEquals(-64, absoluteAngle1.getSignedBygrees());
  }

  @Test
  public void test11()  throws Throwable  {
      AngleBracket angleBracket0 = AngleBracket.all();
      AbsoluteAngle absoluteAngle0 = angleBracket0.getClockwiseBound();
      assertNull(absoluteAngle0);
  }
}
