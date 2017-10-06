/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.gui.renderers;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import java.awt.Graphics2D;
import java.util.HashSet;
import java.util.Set;
import net.virtualinfinity.atrobots.gui.renderers.ScanRenderer;
import net.virtualinfinity.atrobots.measures.AngleBracket;
import net.virtualinfinity.atrobots.measures.Vector;
import net.virtualinfinity.atrobots.snapshots.ScanSnapshot;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ScanRendererEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      ScanRenderer scanRenderer0 = new ScanRenderer();
      assertNotNull(scanRenderer0);
      
      boolean boolean0 = scanRenderer0.isFillArcs();
      assertEquals(false, boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      ScanRenderer scanRenderer0 = new ScanRenderer();
      assertNotNull(scanRenderer0);
      
      scanRenderer0.setFillArcs(false);
      assertEquals(false, scanRenderer0.isFillArcs());
  }

  @Test
  public void test2()  throws Throwable  {
      ScanRenderer scanRenderer0 = new ScanRenderer();
      assertNotNull(scanRenderer0);
      
      AngleBracket angleBracket0 = AngleBracket.all();
      ScanSnapshot scanSnapshot0 = new ScanSnapshot(angleBracket0, (double) (-1161), false, (Vector) null, false, (-1161));
      // Undeclared exception!
      try {
        scanRenderer0.render((Graphics2D) null, scanSnapshot0, (Set<Integer>) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test3()  throws Throwable  {
      ScanRenderer scanRenderer0 = new ScanRenderer();
      assertNotNull(scanRenderer0);
      
      AngleBracket angleBracket0 = AngleBracket.all();
      ScanSnapshot scanSnapshot0 = new ScanSnapshot(angleBracket0, (double) 1938, true, (Vector) null, true, 1938);
      HashSet<Integer> hashSet0 = new HashSet<Integer>();
      // Undeclared exception!
      try {
        scanRenderer0.render((Graphics2D) null, scanSnapshot0, (Set<Integer>) hashSet0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
