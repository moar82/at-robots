/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.arena;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.ArenaObjectVisitorAdaptor;
import net.virtualinfinity.atrobots.arena.Explosion;
import net.virtualinfinity.atrobots.measures.AbsoluteAngle;
import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.measures.Vector;
import net.virtualinfinity.atrobots.snapshots.ExplosionSnapshot;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class ExplosionEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      AbsoluteAngle absoluteAngle0 = AbsoluteAngle.fromBygrees(1291);
      Vector vector0 = absoluteAngle0.toVector(194.42456624560356);
      Explosion explosion0 = new Explosion(vector0, 194.42456624560356);
      ExplosionSnapshot explosionSnapshot0 = (ExplosionSnapshot)explosion0.getSnapshot();
      assertEquals(194.42456624560356, explosionSnapshot0.getRadius(), 0.01D);
      assertEquals(-0.0, explosionSnapshot0.getVelocityY(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      Explosion explosion0 = new Explosion((Vector) null, (-1109.6646965912687));
      ArenaObjectVisitorAdaptor arenaObjectVisitorAdaptor0 = new ArenaObjectVisitorAdaptor();
      explosion0.accept((ArenaObjectVisitor) arenaObjectVisitorAdaptor0);
      assertEquals(false, explosion0.isDead());
  }

  @Test
  public void test2()  throws Throwable  {
      Explosion explosion0 = new Explosion((Vector) null, 0.125);
      Duration duration0 = Duration.ONE_CYCLE;
      explosion0.update(duration0);
      explosion0.update(duration0);
      assertEquals(true, explosion0.isDead());
  }

  @Test
  public void test3()  throws Throwable  {
      Explosion explosion0 = new Explosion((Vector) null, (-1.0));
      Duration duration0 = Duration.fromCycles((-739));
      explosion0.update(duration0);
      assertEquals(false, explosion0.isDead());
  }
}
