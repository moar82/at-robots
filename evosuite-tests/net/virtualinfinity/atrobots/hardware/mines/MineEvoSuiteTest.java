/*
 * This file was automatically generated by EvoSuite
 */

package net.virtualinfinity.atrobots.hardware.mines;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.evosuite.junit.EvoSuiteRunner;
import static org.junit.Assert.*;
import net.virtualinfinity.atrobots.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.ArenaObjectVisitorAdaptor;
import net.virtualinfinity.atrobots.arena.Arena;
import net.virtualinfinity.atrobots.arena.FrameBuilder;
import net.virtualinfinity.atrobots.arena.Position;
import net.virtualinfinity.atrobots.arena.TangibleArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.DamageInflicter;
import net.virtualinfinity.atrobots.hardware.mines.Mine;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import net.virtualinfinity.atrobots.snapshots.MineSnapshot;
import org.junit.BeforeClass;

@RunWith(EvoSuiteRunner.class)
public class MineEvoSuiteTest {

  @BeforeClass 
  public static void initEvoSuiteFramework(){ 
    org.evosuite.Properties.REPLACE_CALLS = true; 
  } 


  @Test
  public void test0()  throws Throwable  {
      Mine mine0 = new Mine((DamageInflicter) null);
      MineSnapshot mineSnapshot0 = (MineSnapshot)mine0.getSnapshot();
      assertEquals(0.0, mineSnapshot0.getTriggerRadius(), 0.01D);
      assertEquals(0.0, mineSnapshot0.getVelocityX(), 0.01D);
  }

  @Test
  public void test1()  throws Throwable  {
      Robot robot0 = new Robot("", 1454, (RobotScore) null);
      Mine mine0 = new Mine((DamageInflicter) robot0);
      Position position0 = new Position();
      mine0.setPosition(position0);
      assertEquals(false, mine0.isDead());
  }

  @Test
  public void test2()  throws Throwable  {
      Mine mine0 = new Mine((DamageInflicter) null);
      ArenaObjectVisitorAdaptor arenaObjectVisitorAdaptor0 = new ArenaObjectVisitorAdaptor();
      mine0.accept((ArenaObjectVisitor) arenaObjectVisitorAdaptor0);
      assertEquals(false, mine0.isDead());
  }

  @Test
  public void test3()  throws Throwable  {
      Mine mine0 = new Mine((DamageInflicter) null);
      mine0.setTriggerRadius((-19.709936714450713));
      assertEquals(false, mine0.isDead());
  }

  @Test
  public void test4()  throws Throwable  {
      RobotScoreKeeper robotScoreKeeper0 = new RobotScoreKeeper();
      Robot robot0 = new Robot("DEL", (-1681), (RobotScore) robotScoreKeeper0);
      Mine mine0 = new Mine((DamageInflicter) null);
      // Undeclared exception!
      try {
        mine0.checkCollision((TangibleArenaObject) robot0);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {
      }
  }

  @Test
  public void test5()  throws Throwable  {
      Robot robot0 = new Robot("", 1454, (RobotScore) null);
      Mine mine0 = new Mine((DamageInflicter) robot0);
      mine0.checkCollision((TangibleArenaObject) robot0);
      assertEquals(false, robot0.isOverburn());
  }

  @Test
  public void test6()  throws Throwable  {
      Mine mine0 = new Mine((DamageInflicter) null);
      FrameBuilder frameBuilder0 = new FrameBuilder();
      Arena arena0 = new Arena(frameBuilder0);
      mine0.setArena(arena0);
      mine0.explode();
      RobotScoreKeeper robotScoreKeeper0 = new RobotScoreKeeper();
      Robot robot0 = new Robot("horizontalAlignment", 886, (RobotScore) robotScoreKeeper0);
      mine0.checkCollision((TangibleArenaObject) robot0);
      assertEquals(true, mine0.isDead());
  }

  @Test
  public void test7()  throws Throwable  {
      Mine mine0 = new Mine((DamageInflicter) null);
      FrameBuilder frameBuilder0 = new FrameBuilder();
      Arena arena0 = new Arena(frameBuilder0);
      mine0.setArena(arena0);
      mine0.explode();
      mine0.explode();
      assertEquals(true, mine0.isDead());
  }
}
