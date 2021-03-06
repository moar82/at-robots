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
import net.virtualinfinity.atrobots.gui.renderers.GradientExplosionRenderer;
import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.snapshots.ExplosionSnapshot;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class GradientExplosionRendererEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      GradientExplosionRenderer gradientExplosionRenderer0 = new GradientExplosionRenderer();
      Duration duration0 = Duration.ZERO_CYCLE;
      ExplosionSnapshot explosionSnapshot0 = new ExplosionSnapshot(1823.9596956408325, duration0);
      HashSet<Integer> hashSet0 = new HashSet<Integer>();
      // Undeclared exception!
      try {
        gradientExplosionRenderer0.render((Graphics2D) null, explosionSnapshot0, (Set<Integer>) hashSet0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }
}
