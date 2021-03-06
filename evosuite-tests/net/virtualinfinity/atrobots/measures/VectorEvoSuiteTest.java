/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.measures;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.geom.Point2D;
import net.virtualinfinity.atrobots.measures.AbsoluteAngle;
import net.virtualinfinity.atrobots.measures.Vector;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class VectorEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromBygrees((-801));
      Vector vector0 = absoluteAngle0.toVector((double) (-801));
      Vector vector1 = vector0.projectOnto(vector0);
      assertNotNull(vector1);
      assertEquals(552.3219763343906, vector1.getY(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      Vector vector0 = Vector.createCartesian(599.4635754259658, 599.4635754259658);
      String string0 = vector0.toString();
      assertNotNull(string0);
      assertEquals("<0.7853981633974483r/96, 847.7695185160677>:<599.4635754259658, 599.4635754259658>", string0);
  }

  @Test
  public void test2()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromBygrees((-801));
      Vector vector0 = absoluteAngle0.toVector((double) (-801));
      Point2D.Double point2D_Double0 = (Point2D.Double)vector0.toPoint2D();
      assertEquals("Point2D.Double[580.1219134441251, 552.3219763343906]", point2D_Double0.toString());
      assertNotNull(point2D_Double0);
  }

  @Test
  public void test3()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromRadians(0.0);
      Vector vector0 = Vector.createCartesian((-1.0), 0.0);
      assertNotNull(vector0);
      
      Vector vector1 = vector0.perpendicularIntersectionFrom(vector0, absoluteAngle0, (double) (-873));
      assertNull(vector1);
      assertEquals("<3.141592653589793r/192, 1.0>:<-1.0, 0.0>", vector0.toString());
      assertEquals(1.0, vector0.getMagnitude(), 0.01D);
  }

  @Test
  public void test4()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian((-1393.4638225116755), 1674.9924295219112);
      Vector vector0 = absoluteAngle0.toUnitVector();
      Vector vector1 = vector0.perpendicularIntersectionFrom(vector0, absoluteAngle0, 738.0996149273094);
      assertNotNull(vector1);
      assertEquals("<2.264701378497671r/156, 1.0>:<-0.639544076723452, 0.7687544301842737>", vector1.toString());
  }

  @Test
  public void test5()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian((-1.0), 0.0);
      Vector vector0 = absoluteAngle0.toVector((-1.0));
      assertNotNull(vector0);
      
      boolean boolean0 = vector0.equals((Object) vector0);
      assertEquals(true, boolean0);
      assertEquals("<0.0r/64, 1.0>:<1.0, 0.0>", vector0.toString());
  }

  @Test
  public void test6()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromBygrees(0);
      Vector vector0 = absoluteAngle0.toUnitVector();
      assertNotNull(vector0);
      
      boolean boolean0 = vector0.equals((Object) "4.71238898038469r/0");
      assertEquals((-1.0), vector0.getY(), 0.01D);
      assertEquals(false, boolean0);
  }

  @Test
  public void test7()  throws Throwable  {
      Vector vector0 = Vector.createCartesian((-1.0), 0.0);
      Vector vector1 = vector0.plus(vector0);
      assertNotNull(vector1);
      
      boolean boolean0 = vector0.equals((Object) vector1);
      assertEquals("<3.141592653589793r/192, 1.0>:<-1.0, 0.0>", vector0.toString());
      assertFalse(vector1.equals(vector0));
      assertEquals(false, boolean0);
      assertEquals(2.0, vector1.getMagnitude(), 0.01D);
  }

  @Test
  public void test8()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromCartesian((-1.0), 0.0);
      Vector vector0 = absoluteAngle0.toVector((-1.0));
      Vector vector1 = absoluteAngle0.toUnitVector();
      Vector vector2 = vector0.plus(vector1);
      assertNotNull(vector2);
      
      Vector vector3 = absoluteAngle0.toVector(0.0);
      boolean boolean0 = vector2.equals((Object) vector3);
      assertEquals(false, boolean0);
      assertFalse(vector3.equals(vector0));
      assertFalse(vector3.equals(vector2));
      assertFalse(vector0.equals(vector3));
      assertEquals("<0.0r/64, 1.0>:<1.0, 0.0>", vector0.toString());
      assertEquals("<1.5707963267948966r/128, 1.2246467991473532E-16>:<0.0, 1.2246467991473532E-16>", vector2.toString());
  }
}
